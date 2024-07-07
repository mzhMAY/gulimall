package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis-Plus
 *      1）导入依赖
 *          <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-spring-boot3-starter</artifactId>
 *             <version>3.5.7</version>
 *          </dependency>
 *      2) 配置
 *          1、配置数据源
 *              1） 导入数据库的驱动
 *              2) 在application.yml配置数据源相关信息
 *          2、配置Mybatis-Plus
 *              1）使用@MapperScan
 *  *           2) 告诉MyBatis-Plus，sql映射文件位置
 */

@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}