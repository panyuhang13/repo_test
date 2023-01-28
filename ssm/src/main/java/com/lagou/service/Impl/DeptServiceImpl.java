package com.lagou.service.Impl;

import com.lagou.dao.DeptDao;
import com.lagou.domain.Dept;
import com.lagou.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Array;
import java.util.List;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    public List<Dept> findAll() {
        List<Dept> all = deptDao.findAll();
        return all;
    }

    @Override
    public Dept findById(Integer id) {
        return deptDao.findById(id);
    }
}
