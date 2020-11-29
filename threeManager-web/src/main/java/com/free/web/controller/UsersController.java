package com.free.web.controller;

import com.free.pojo.Users;
import com.free.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UsersController {


    @Autowired
    private UsersService usersService;

    @RequestMapping("/selUser")
    public String selUser(Users users,Map<String,List<Users>> map){
       List<Users> usersList = this.usersService.selectUser();
      System.out.println(usersList);
       map.put("users",usersList);
       return "ok";
    }

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}",method = RequestMethod.GET)
    public String doGet(@PathVariable Integer userid){
        System.out.println("doGet.........."+userid);
        return "ok";
    }
    /**
     * doPost
     */
    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doGet(Users users){
        System.out.println("doPost..........");
        System.out.println(users);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete",method = RequestMethod.DELETE)
    public String doDelete(Integer userid){
        System.out.println("doPost.........."+userid);
        return "ok";
    }
    /**
     * doDelete
     */
    @RequestMapping(value = "/doPut",method = RequestMethod.PUT)
    public String doPut(){
        System.out.println("doPut..........");
        return "ok";
    }

}
