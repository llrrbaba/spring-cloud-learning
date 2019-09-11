package cn.rocker.springcloudlearningeurekaclientarticleservice.controller;

import cn.rocker.springcloudlearningeurekaclientarticleservice.service.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author rocker
 * @date 2019/09/08 19:11
 * @since V1.0
 */
@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;
    @Resource(name = "eureka-client-user-service")
    private UserRemoteClient userRemoteClient;

    @GetMapping("/article/callHello")
    public String callHello(){
        // v1.直接调用，不走eureka
//        return restTemplate.getForObject("http://localhost:8082/user/hello", String.class);

        // v2.通过应用名调用，走eureka
//        return restTemplate.getForObject("http://eureka-client-user-service/user/hello", String.class);

        // v3.通过feign接口调用
        int nextInt = new Random().nextInt(10000);
        return userRemoteClient.hello(nextInt);
    }

}
