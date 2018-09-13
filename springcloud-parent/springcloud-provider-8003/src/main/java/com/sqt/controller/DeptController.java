package com.sqt.controller;

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
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    /**查询所有部门
     * @return
     */
    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

}
