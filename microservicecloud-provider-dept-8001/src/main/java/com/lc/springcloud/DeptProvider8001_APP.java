package com.lc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // eureka客户端注册
@EnableDiscoveryClient // 服务发现
public class DeptProvider8001_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_APP.class, args);
    }
}
