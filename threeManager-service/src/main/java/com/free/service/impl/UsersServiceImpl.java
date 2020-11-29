package com.free.service.impl;

import com.free.mapper.UsersMapper;
import com.free.pojo.Users;
import com.free.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:http://www.free.com
 * @Date:2020/11/28 0028
 * @Description:com.free.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public List<Users> selectUser() {
        return usersMapper.selectAllUsers();
    }
}
