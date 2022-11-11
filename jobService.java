package com.example.btb1.service;

import com.example.btb1.model.job;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

@Service
public class jobService {
    private List<job> jobs;

    public jobService() {
        jobs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            jobs.add(new job("job" + i, "kiemtien" + i, "laptrinhvien" + i, "hanoi" + i, 500, (500 + i) * i + 2, "vuvandung" + i + "@gmail.com"));
        }

    }

    public job randomJob() {
        Random rn = new Random();
        int answer = rn.nextInt(10);
        return jobs.get(answer);
    }

    public List<job> getAllJob() {
        return jobs;
    }

    public List<job> sortSalary(String max_salary) {
        if (max_salary.equals("desc")) {
            Collections.sort(jobs, new Comparator<job>() {
                @Override
                public int compare(job o1, job o2) {
                    return o1.getMaxSalary() > o2.getMaxSalary() ? -1 : 1;
                }
            });
        } else if (max_salary.equals("asc")) {
            Collections.sort(jobs, new Comparator<job>() {
                @Override
                public int compare(job o1, job o2) {
                    return o1.getMaxSalary() < o2.getMaxSalary() ? -1 : 1;
                }
            });
        }
        return jobs;
    }

}
