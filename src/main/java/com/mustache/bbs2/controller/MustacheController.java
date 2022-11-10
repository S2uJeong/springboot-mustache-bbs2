package com.mustache.bbs2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller : Model이 데이터를 어떻게 처리할지 알려주는 역할
//              제공하고자 하는 서비스에 따라 다른 컨트롤러를 생성해서 만들어 주면 유지보수에 좋음
@Controller
public class MustacheController {

    @GetMapping(value = "/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username", "sj9802");
        return "greetings";
    }
}
