package com.example.newdocument202302.service.impl;

import com.example.newdocument202302.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class TestServiceImpl implements TestService {


    @Transactional
    @Override
    public void testOne() {

    }

    @Override
    public Class<? extends SummerService> getService(String code, SummerService summerService) {
        Class<? extends SummerService> aClass = summerService.getClass();
        String name = aClass.getName();
        String s = name + "." + code;
        Class<? extends  SummerService> aClass1 = null;
//                Class.forName(s);
        return aClass1;
    }
}
