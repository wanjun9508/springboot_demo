package com.example.demo;

import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * @ClassName: 测试springboot
 * @Auther: Administrator
 * @Date: 2018/12/24 0024 15:08
 * @Description: Wan
 * @Version: 1.0
 **/
@Controller
public class HelloController {
//    @Autowired
//    private StudentProperties studentProperties;

    @RequestMapping(value = "/")
    public String hello(Model m) {

        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));

        return "hello";
    }
}
