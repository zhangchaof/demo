package com.example.demo.guava;

import com.example.demo.mybatis.BusinessEnums;
import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zcf
 * @Date: 2019/8/27 9:59
 */
@Service
public class BusinessServiceImpl {
    @Autowired
    private LoadingCache<String, BusinessEnums> businessEnumsDtoLoadingCache;

    public void test() {

    }
}
