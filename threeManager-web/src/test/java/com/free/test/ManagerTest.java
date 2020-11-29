package com.free.test;

import com.free.mapper.UsersMapper;
import com.free.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther:http://www.free.com
 * @Date:2020/11/28 0028
 * @Description:com.free.test
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void selectUserAll(){
        List<Users> list = usersMapper.selectAllUsers();
        System.out.println(list);
    }
}
