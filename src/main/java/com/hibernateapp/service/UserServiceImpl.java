package com.hibernateapp.service;

import com.hibernateapp.dao.UserDao;
import com.hibernateapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void delete(Integer id) {
        userDao.deleteUser(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User getUser(Integer id){
        return userDao.getUser(id);
    }

    @Override
    public void editUser(User user){
        userDao.editUser(user);
    }

    @Override
    public List getAllUser(){
        return userDao.getAllUser();
    }

}
