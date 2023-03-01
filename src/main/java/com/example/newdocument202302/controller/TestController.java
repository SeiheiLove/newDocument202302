package com.example.newdocument202302.controller;

import com.example.newdocument202302.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {


    @Autowired
    private TestService testService;
    /**
     * 测试请求接口
     */
    @RequestMapping
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String, Object> responseMap = new HashMap<>();
        testService.testOne();
        return responseMap;
    }
}
