package com.andy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = "com.andy.mapper")
public class OrderManage
{
    public static void main( String[] args )
    {
        SpringApplication.run(OrderManage.class,args);
        System.out.println("欢迎进入订单系统");
    }
}
