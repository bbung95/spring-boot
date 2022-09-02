package com.spring.springbootmvc.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("hello")
    public String hello(Model model){

        model.addAttribute("message","bbung");

        return "hello";
    }

    @PostMapping("users/create")
    @ResponseBody
    public User create(@RequestBody User user){

        return user;
    }

}
