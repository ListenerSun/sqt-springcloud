package com.sqt.controller;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.sqt.entities.Dept;
import com.sqt.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: sqt
 * @Description:
 * @Date: Created in 18:41 ${Date}
 */
@RestController
public class DeptController_Consumer {
    
    @Autowired
    private DeptClientService deptService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptService.add(dept);
    }


    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptService.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list() {

        return deptService.list();
    }


}
