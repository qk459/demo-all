package com;
import com.demo.dao.UserMapper;
import com.demo.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoAllApplication.class)
@RunWith(SpringRunner.class)
public class DemoAllApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public  void contextLoads() {
        System.out.println("Hello word");
    }

    @Test
    public void insertUser(){
        User user=new User();
        user.setUserId(2);
        user.setUserName("TestAdd");
        user.setAge(25);
        userMapper.insert(user);
    }

}
