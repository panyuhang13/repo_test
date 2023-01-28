package com.lagou.service;

import com.lagou.domain.Worker;
import org.springframework.stereotype.Service;

import java.util.List;

public interface WorkerService {

    public void saveWorker(Worker worker);

    public List<Worker> findAll();
}
