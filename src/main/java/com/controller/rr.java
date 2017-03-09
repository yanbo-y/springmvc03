package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/8.
 */
@Controller
public class rr {

    @RequestMapping("/ok")
    public String ok() {
        return "ok";
    }
    @RequestMapping("/ok.do")@ResponseBody
    public String okl() {
        return "ok.do";
    }
    @RequestMapping("/okk")
    @ResponseBody
    public String bb() {
        return "okbbbbbbbbbbbbbbb";
    }


    @RequestMapping("/yy")
    public String yy() {
        return "user";
    }

}
