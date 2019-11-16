package com.example.spring.demo.controller;


import com.example.spring.demo.entity.User;
import com.example.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author liutianqi
 * @date 2019/11/16
 */
@RestController

@RequestMapping(value = "index")
//@RequestMapping("/index") //在类上使用RequestMapping，里面设置的value就是方法的父路径
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    public String index(){
        return "hello spring boot";
    }


    @GetMapping("/get/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        User user = userService.getById(userId);
        return user;
    }

    @PutMapping(value = "/insert")
    public User insert(User user) {
        userService.insertUser(user);
        return user;
    }

    @PostMapping(value = "/update")
    public User update(User user) {
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping(value="/delete")
    public boolean delete(int id){
        return userService.deleteByID(id);
    }

}
