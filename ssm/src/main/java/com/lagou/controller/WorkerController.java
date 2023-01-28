package com.lagou.controller;

import com.lagou.domain.Dept;
import com.lagou.domain.Worker;
import com.lagou.domain.student;
import com.lagou.service.DeptService;
import com.lagou.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.List;

@Controller
@RequestMapping("/worker")
public class WorkerController {

    @Autowired
    private WorkerService workerService;

    @Autowired
    private DeptService deptService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Worker> all = workerService.findAll();
        model.addAttribute("list", all);
        return "workerlist";
    }

    @RequestMapping("/saveWorker")
    public String saveWorker(Worker worker){
        workerService.saveWorker(worker);
        return "redirect:/worker/findAll";
    }
}
