package com.sqt.service.impl;

import com.sqt.dao.DeptDao;
import com.sqt.entities.Dept;
import com.sqt.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: sqt
 * @Description:
 * @Date: Created in 22:25 ${Date}
 */
@Service
public class DeptServiceImpl  implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}
