package com.qfedu.mtl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Controller
public class PageController {

    @RequestMapping("/info.html")
    public String info() {
        return "info";
    }

    @RequestMapping("/login.html")
    public String login() {
        return "login";
    }

}
