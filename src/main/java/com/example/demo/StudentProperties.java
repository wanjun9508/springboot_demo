package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: 配置类
 * @Auther: Administrator
 * @Date: 2018/12/24 0024 15:40
 * @Description: Wan
 * @Version: 1.0
 **/
@Component
@ConfigurationProperties(prefix ="student")
public class StudentProperties {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
