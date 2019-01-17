package com.cat.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * className:empDao
 * discription:
 * author:王震涛
 * createTime:2019-01-16 19:32
 */
public interface empDao {

    /**
     * 查询员工
     * @return
     */
    @Select("select d.dname,e.empyear,e.empmonth,round(AVG(e.empsalary),2) as salary from employee e,department d where e.deptno=d.deptno group by d.dname,e.empyear,e.empmonth order by d.deptno,e.empyear,e.empmonth")
    List<Map> selectEmp();

    /**
     * 查询部门
     * @return
     */
    @Select("select deptno,dname,loc from department")
    List<Map> selectDept();

    /**
     * 添加
     * @return
     */
    @Insert("insert into employee values(null,#{empName},#{empSalary},#{empYear},#{empMonth},#{deptNo})")
    int add(Map map);
}
