package com.powernode.myspring.bean;

/**
 * @author 鹏
 * @version 1.0
 * @description: TODO
 * @date 2024/1/9 18:03
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(){
        System.out.println("UserService开始执行save操作");
        userDao.insert();
        System.out.println("UserService执行save操作结束");
    }
}

