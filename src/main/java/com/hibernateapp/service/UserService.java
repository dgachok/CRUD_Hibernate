package com.hibernateapp.service;

import com.hibernateapp.model.User;

import java.util.List;

public interface UserService {

    void delete(Integer id);

    void addUser(User user);

    User getUser(Integer id);

    void editUser(User user);

    List getAllUser();

}
