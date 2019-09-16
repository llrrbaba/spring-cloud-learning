package cn.rocker.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author rocker
 * @date 2019/09/15 14:38
 * @since V1.0
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/callHello")
    @HystrixCommand(fallbackMethod = "defaultHello", commandProperties = {@HystrixProperty(name = "execution.isolation.strategy", value = "THREAD")})
    public String callHello(){
        String result = restTemplate.getForObject("http://localhost:8088/house/hello", String.class);
        return result;
    }

    private String defaultHello(){
        return "fail";
    }

}
