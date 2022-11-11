package com.example.btb1.controller;

import com.example.btb1.model.job;
import com.example.btb1.service.jobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/")
public class jobController {

    @Autowired
    private jobService jobService;

    @GetMapping("jobs")
    public List<job> getAllJob(){
        return jobService.getAllJob();
    }

    @GetMapping("jobs/random")
    public job randomJob(){
       return jobService.randomJob();
    }

    @GetMapping("jobs/sort")
    public List<job> sort(@RequestParam(name = "max_salary") String max_salary ){
        return jobService.sortSalary(max_salary);
    }
}
