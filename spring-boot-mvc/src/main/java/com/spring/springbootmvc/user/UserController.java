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

    @GetMapping("error")
    @ResponseBody
    public String getError(){

        throw new CustomError();
    }

    @ExceptionHandler(CustomError.class)
    @ResponseBody
    public ErrorMessage errorMessage(CustomError customError){

        ErrorMessage message = new ErrorMessage();
        message.setMessage("에러 발생");
        message.setReason(customError.getMessage());

        System.out.println("message = " + message);

        return message;
    }

}
