package cn.rocker.springcloudlearningeurekaclient.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author rocker
 * @date 2019/09/08 19:04
 * @since V1.0
 */
@RestController
public class UserController /*implements UserRemoteClient */{

    @GetMapping("/user/hello")
    public String hello(@RequestParam("randomNum") Integer randomNum){
//        try {
//            Thread.sleep(999);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        if(randomNum % 2 == 0){
//            throw new RuntimeException("来了个偶数，真新鲜");
//        }
        return String.format("hello:%s", randomNum);
    }

}
