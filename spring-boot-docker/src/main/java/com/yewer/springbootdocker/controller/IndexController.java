package com.yewer.springbootdocker.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Value("${person.id}")
    private String personId;

    @RequestMapping(value = "/hh")
    public String say() {
        return "hello " + personId;
    }

    @RequestMapping(value = "/returnmap")
    public Map<String, Object> returnmap() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("key1", "value1");
        retMap.put("key2", "value2");
        return retMap;
    }

}
