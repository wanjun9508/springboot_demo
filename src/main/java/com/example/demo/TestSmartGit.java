package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * 描述:
 *
 * @author wanjun
 * @version 1.0
 * @classname TestSmartGit
 * @create 2020-07-24 11:13
 */
@Controller
public class TestSmartGit {

    @RequestMapping(value = "/smartGit")
    public String hello(Model m) {
        String test1 = "测试代码";
        String test2 = "测试代码2";
        String test3 = "测试代码3";
        return "hello";
    }
}
