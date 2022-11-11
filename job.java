package com.example.btb1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class job {
    private String id ;
    private String title ;
    private String description; // mô tả tin tuyển dụng
    private String location; // địa chỉ tuyển dụng
    private int minSalary; // lương tối thiểu
    private int maxSalary; //lương tối đa
    private String emailTo; //email nhà tuyển dụng


}
