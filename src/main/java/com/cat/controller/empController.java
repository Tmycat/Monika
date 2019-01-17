package com.cat.controller;

import com.cat.service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:empController
 * discription:
 * author:王震涛
 * createTime:2019-01-16 20:02
 */
@Controller
@RequestMapping("/emp")
public class empController {

    @Autowired
    private empService empService;

    /**
     * 跳转
     * @return
     */
    @RequestMapping("/toEmp")
    public String toHtml(){
        return "html/empsal";
    }

    /**
     * 查询
     * @return
     */
    @ResponseBody
    @RequestMapping("/List")
    public Object empList(){
        List<Map> maps = empService.selectDept();
        List<Map> maps1 = empService.selectEmp();
        System.out.println(maps);
        System.out.println(maps1);
        Map map = new HashMap();
        map.put("emp",maps1);
        map.put("dept",maps);
        return map;
    }

    /**
     * 添加
     * @return
     */
    @ResponseBody
    @RequestMapping("/add")
    public int add(@RequestBody Map params){

        System.out.println("--"+params);
        return empService.add(params);
    }


}
