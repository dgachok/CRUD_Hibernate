package com.hibernateapp.dao;

import com.hibernateapp.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteUser(Integer id) {
        sessionFactory.getCurrentSession().delete(getUser(id));
    }

    @Override
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public User getUser(Integer id){
        return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public List getAllUser(){
        List userList = new ArrayList<User>();
        userList=sessionFactory.getCurrentSession().createQuery("from User").list();
        return userList;
    }

    @Override
    public void editUser(User user){
        sessionFactory.getCurrentSession().update(user);
    }


}
