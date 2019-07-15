package com.yx.mapper;

import com.yx.vo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserMapper {
    public List<User> listuser();
    public  User seluser(String id);
    public  int insertUser(User user);
    public int deluser(String id);

}
