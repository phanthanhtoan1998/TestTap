package com.example;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

import static com.example.commonservice.contants.ChangeLogContant.CHANGE_LOG_PRODUCT;


@SpringBootApplication

public class StudentServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApp.class,args);
    }
    @Bean
    public SpringLiquibase liquibase(DataSource dataSource) {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setDataSource(dataSource);
        liquibase.setChangeLog(CHANGE_LOG_PRODUCT);
        return liquibase;
    }

}
