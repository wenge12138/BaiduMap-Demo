package com.example.mapdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: wengege
 * Date: 2018/7/30
 * Time:0:40
 * To change this template use File | Settings | File Templates
 */
@Controller
@RequestMapping(value = "/")
public class MapController {

    @GetMapping
    public String map(){
        return "testHtml";
    }
}
