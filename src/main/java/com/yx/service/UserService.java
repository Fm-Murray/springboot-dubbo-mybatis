package com.yx.service;

import com.yx.vo.User;
import org.slf4j.Logger;

import java.util.List;

public interface UserService {
    Logger logger = org.slf4j.LoggerFactory.getLogger(UserService.class);


    public List<User> listuser();

    public  User seluser(String id);

    public  int insertUser(User user);

    public int deluser(String id);



}
