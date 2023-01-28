package com.lagou.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.databind.JsonNode;
import com.lagou.domain.Dept;
import com.lagou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;


    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Dept> deptlist = deptService.findAll();
        model.addAttribute("deptlist", deptlist);
        return "deptlist";


    }

    @RequestMapping("/findById")
    @ResponseBody
    public Dept findById(Integer id){
        Dept dept = deptService.findById(id);
        System.out.println(dept);
//        String str = JSONUtils.toJSONString(dept);
//        System.out.println(str);
        return dept;
    }

}
