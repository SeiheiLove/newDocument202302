package com.example.newdocument202302.service;

import com.example.newdocument202302.service.impl.SummerService;

public interface TestService {

    /**
     * 测试方法
     *
     */
    public void testOne();

    public Class<? extends SummerService> getService(String code, SummerService T);
}
