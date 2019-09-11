package cn.rocker.springcloudlearningeurekaclient.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author rocker
 * @date 2019/09/08 19:04
 * @since V1.0
 */
@RestController
public class UserController {

    @GetMapping("/user/hello")
    public String hello(){
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }

}
