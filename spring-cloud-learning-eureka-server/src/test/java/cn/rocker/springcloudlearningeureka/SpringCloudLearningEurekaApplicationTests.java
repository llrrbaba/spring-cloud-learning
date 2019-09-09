package cn.rocker.springcloudlearningeureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Timer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudLearningEurekaApplicationTests {

    @Test
    public void contextLoads() {

        Timer timer = new Timer();

    }

    public static void main(String[] args) {
        System.out.println("主线程开始");
        while (true){
            new Thread(() -> System.out.println("111")).start();
        }
    }

}
