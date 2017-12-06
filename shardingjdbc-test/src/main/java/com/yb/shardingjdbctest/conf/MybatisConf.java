package com.yb.shardingjdbctest.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yb.shardingjdbctest.dao")
public class MybatisConf {
}
