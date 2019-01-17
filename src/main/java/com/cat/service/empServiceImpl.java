package com.cat.service;
import com.cat.dao.empDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * className:empServiceImpl
 * discription:
 * author:王震涛
 * createTime:2019-01-16 19:37
 */
@Service
public class empServiceImpl implements empService {

    @Autowired
    private empDao empDao;
    /**
     * 查询员工
     * @return
     */
    @Override
    public List<Map> selectEmp() {
        return empDao.selectEmp();
    }

    /**
     * 查询部门
     * @return
     */
    @Override
    public List<Map> selectDept() {
        return empDao.selectDept();
    }

    /**
     * 添加
     * @param map
     * @return
     */
    @Override
    public int add(Map map) {
        return empDao.add(map);
    }
}
