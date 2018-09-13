package com.sqt.service;

import com.sqt.entities.Dept;

import java.util.List;

/**
 * @author: sqt
 * @Description:
 * @Date: Created in 22:21 ${Date}
 */
public interface DeptService {

    /**添加部门
     * @param dept
     * @return
     */
    public boolean add(Dept dept);

    /**查询部门
     * @param id
     * @return
     */
    public Dept get(Long id);

    /**查询所有部门
     * @return
     */
    public List<Dept> list();
}
