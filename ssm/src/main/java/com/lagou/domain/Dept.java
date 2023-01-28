package com.lagou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
public class Dept implements Serializable{
    private int id;//部门id
    private String dept_name;//部门名称
    private String major_name;//部门主管
    private String phone;//部门电话
    private String email;//部门邮箱

    public Dept() {
    }

    public Dept(int id, String dept_name, String major_name, String phone, String email) {
        this.id = id;
        this.dept_name = dept_name;
        this.major_name = major_name;
        this.phone = phone;
        this.email = email;
    }
}
