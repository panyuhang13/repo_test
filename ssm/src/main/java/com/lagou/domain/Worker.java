package com.lagou.domain;

import lombok.Data;

@Data
public class Worker {
    private int id; //员工id
    private String name;//员工姓名
    private String post;//员工职位
    private String phone;//员工电话
    private String hiredate;//员工入职时间
    private int dept_id;//员工部门id

    public Worker() {
    }

    public Worker(int id, String name, String post, String phone, String hiredate, int dept_id) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.hiredate = hiredate;
        this.dept_id = dept_id;
    }


}
