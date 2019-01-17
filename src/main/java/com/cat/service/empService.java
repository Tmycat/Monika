package com.cat.service;

import java.util.List;
import java.util.Map;

/**
 * className:empService
 * discription:
 * author:王震涛
 * createTime:2019-01-16 19:36
 */

public interface empService {
    /**
     * 查询员工
     * @return
     */
    List<Map> selectEmp();


    /**
     * 查询部门
     * @return
     */
    List<Map> selectDept();


    /**
     * 添加
     * @return
     */
    int add(Map map);

}
