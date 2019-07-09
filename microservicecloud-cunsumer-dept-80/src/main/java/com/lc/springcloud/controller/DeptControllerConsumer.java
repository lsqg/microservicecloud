package com.lc.springcloud.controller;

import com.lc.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptControllerConsumer {

    private static final String DEPT_REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(DEPT_REST_URL_PREFIX+ "/dept/add",dept,Boolean.class);
    }

    @RequestMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(DEPT_REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping("/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(DEPT_REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(DEPT_REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
