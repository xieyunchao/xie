package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
@RequestMapping("user")
public class UserController{

    @RequestMapping("list")
   public String toList(HttpRequestHandlerServlet Request){

        System.out.println("11111");

      return "list";
}


}
