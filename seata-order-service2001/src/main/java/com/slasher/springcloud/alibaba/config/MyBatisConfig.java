package com.slasher.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther jit
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({"com.slasher.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
