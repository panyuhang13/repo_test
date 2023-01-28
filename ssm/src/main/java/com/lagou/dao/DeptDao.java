package com.lagou.dao;

import com.lagou.domain.Dept;

import java.lang.reflect.Array;
import java.util.List;

public interface DeptDao {

    public List<Dept> findAll();

    public Dept findById(Integer id);
}
