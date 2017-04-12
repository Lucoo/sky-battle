package com.lucoo.sky.battle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User: hushenbing@zillionfortune.com
 * Date: 2017/3/15
 * Time: 上午11:42
 */
@Controller
@Slf4j
public class IndexController {

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }
}
