package com.sram.test;
import com.sram.MyApp;
import com.sram.dao.UserDao;
import com.sram.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class TestUser {

    @Autowired
    private UserDao userDao;

    @Test
    public void  test(){
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
