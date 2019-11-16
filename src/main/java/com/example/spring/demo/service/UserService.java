package com.example.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.demo.Mapper.UserMapper;
import com.example.spring.demo.entity.User;
/**
 * @author liutianqi
 * @date 2019/11/16
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getById(int id){
        return userMapper.getById(id);
    }

    public User insertUser(User user) {
         userMapper.insertUser(user);
         return user;
    }
    public  User updateUser(User user){
        userMapper.updateUser(user);
        return user;
    }

    public boolean deleteByID(int id){
        boolean flag=userMapper.deleteUser(id);
        //System.out.println(flag);
        return flag;
    }
}
