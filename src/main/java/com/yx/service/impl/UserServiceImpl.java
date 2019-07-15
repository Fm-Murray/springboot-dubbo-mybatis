package com.yx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yx.mapper.UserMapper;
import com.yx.service.UserService;
import com.yx.vo.User;
import org.slf4j.Logger;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private static Logger logger = org.slf4j.LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    UserMapper userMapper;
    @Override
    public List<User> listuser() {
        return userMapper.listuser();
    }

    @Override
    public User seluser(String id) {
        return userMapper.seluser(id);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deluser(String id) {
        return userMapper.deluser(id);
    }


}

