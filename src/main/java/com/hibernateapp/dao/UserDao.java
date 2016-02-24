package com.hibernateapp.dao;

import com.hibernateapp.model.User;

import java.util.List;

public interface UserDao {

    void deleteUser(Integer id);

    void addUser(User user);

    User getUser(Integer id);

    void editUser(User user);

    List getAllUser();
}
