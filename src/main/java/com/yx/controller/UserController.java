package com.yx.controller;

import com.alibaba.dubbo.common.json.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yx.service.UserService;
import com.yx.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    //    @GetMapping("/html")
//    public String index(){
//        return "/uselist.html";
//    }
    @DeleteMapping("sel/{id}")
    public List<User> getUser(@PathVariable int id){
        int k=userService.deluser(String.valueOf(id));
        List<User> list=null;
        if(k>0){
            list=userService.listuser();
        }
        return list;
    }
    @GetMapping("/list")
    public PageInfo<User> getlist(){
        PageHelper.startPage(1,3);
        return  new PageInfo<>(userService.listuser());
    }
    @PostMapping("/user")
    @ResponseBody
    public  int insertUser(@RequestBody User user){
        System.out.println("user:"+user);
        return  userService.insertUser(user);
    }


}

