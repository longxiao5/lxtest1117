package com.example.spring.demo.Mapper;

import com.example.spring.demo.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @author liutianqi
 * @date 2019/11/16
 */
@Repository
public interface UserMapper {
    User getById(int id);
    public boolean insertUser(User user);
    public boolean insert(String name);
    public List<User> getUsers();
    public boolean updateUser(User user);
    public boolean deleteUser(int id);
    public boolean deleteAllUsers();

}
