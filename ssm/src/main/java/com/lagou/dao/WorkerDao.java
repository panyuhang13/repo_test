package com.lagou.dao;

import com.lagou.domain.Worker;

import java.util.List;

public interface WorkerDao {

    public void saveWorker(Worker worker);

    public List<Worker> findAll();
}
