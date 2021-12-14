package com.example.mapper;

import com.example.pojo.Role;
import com.example.pojo.User;

import java.util.List;

public interface UserMapper {
    // 插入用户
    public void insertUser(User user);

    // 查询所有用户
    public List<User> selectAllUsers();

    // 根据id查询某个用户
    public User selectUserById(String id);

    // 查询当前用户的角色
    public List<Role> selectRoleByUserId(String id);
}
