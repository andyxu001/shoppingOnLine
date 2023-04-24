package com.andy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan(basePackages = "com.andy.mapper")
public class UserManage
{
    public static void main( String[] args )
    {
        SpringApplication.run(UserManage.class,args);
        System.out.println("欢迎进入用户管理系统");
    }
}
