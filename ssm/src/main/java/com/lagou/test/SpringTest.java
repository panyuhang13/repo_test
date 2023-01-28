package com.lagou.test;

import com.lagou.domain.Dept;
import com.lagou.domain.Worker;
import com.lagou.service.DeptService;
import com.lagou.service.WorkerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private DeptService deptService;

    @Autowired
    private WorkerService workerService;

    @Test
    public void Test1(){
        List<Dept> all = deptService.findAll();
        System.out.println(all);
    }


    @Test
    public void test2(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);

        Worker worker = new Worker();
        worker.setDept_id(101);
        worker.setHiredate(format);
        worker.setName("赵云");
        worker.setPost("员工");
        worker.setPhone("13133123131");

        workerService.saveWorker(worker);
    }

    @Test
    public void Test3(){
        List<Worker> all = workerService.findAll();
        for (Worker worker : all) {
            System.out.println(worker);
        }
    }

    @Test
    public void test4(){
        Dept dept = new Dept();
    }


}
