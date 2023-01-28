package com.lagou.service.Impl;

import com.lagou.dao.WorkerDao;
import com.lagou.domain.Worker;
import com.lagou.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    private WorkerDao workerDao;

    @Override
    public void saveWorker(Worker worker) {
        workerDao.saveWorker(worker);
    }

    @Override
    public List<Worker> findAll() {
        List<Worker> all = workerDao.findAll();
        return all;
    }
}
