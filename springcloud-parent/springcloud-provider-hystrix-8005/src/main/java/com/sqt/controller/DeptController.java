package com.sqt.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sqt.entities.Dept;
import com.sqt.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: sqt
 * @Description:
 * @Date: Created in 22:46 ${Date}
 */
@RestController
public class DeptController {

    @Resource
    private DeptService deptService;

    /**增加部门
     * @param dept
     * @return
     */
    @RequestMapping(value = "/dept/add" ,method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    /**根据id查询部门
     * @param id
     * @return
     */

    //getError() 方法会在该方法跑出异常时调用
    @HystrixCommand(fallbackMethod = "getError")
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if (null == dept){
            throw new RuntimeException("您查询的部门编号不存在");
        }
        return dept;
    }

    /**查询所有部门
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }



    /**服务熔断时调用的方法
     * @param id
     * @return
     */
    public Dept getError(@PathVariable("id") Long id){

        return new Dept().setDeptno(id).setDname("该"+id+"编号部门不存在,该服务已被熔断").setDb_source("no datasource in Mysql");
    }

}
