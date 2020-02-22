package com;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DemoAllApplication.class)
@RunWith(SpringRunner.class)
public class DemoAllApplicationTests {


    @Test
    public  void contextLoads() {
        System.out.println("Hello word");
    }


}
