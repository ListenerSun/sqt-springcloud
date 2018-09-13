package com.sqt.dao;

import java.util.List;

import com.sqt.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

//@Repository(value = "deptDao")
@Mapper()
public interface DeptDao{

	/**添加部门
	 * @param dept
	 * @return
	 */
	public boolean addDept(Dept dept);

	/**根据id查找部门
	 * @param id
	 * @return
	 */
	public Dept findById(Long id);

	/**查找所有部门
	 * @return
	 */
	public List<Dept> findAll();
}
