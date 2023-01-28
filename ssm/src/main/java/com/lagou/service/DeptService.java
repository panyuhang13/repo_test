package com.lagou.service;

import com.lagou.domain.Dept;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;


public interface DeptService {
    public List<Dept> findAll();

    public Dept findById(Integer id);
}
