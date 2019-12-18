package com.example.demo;

import javax.xml.bind.annotation.XmlElementRef;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller

public class MyController {



    @RequestMapping("/")
    public String login(){

        return "you are logged in";
    }


    //adding for web Controller

    @RequestMapping("/NewWeb")
    public String NewWeb(){

        return "NewWeb";
    }
}
