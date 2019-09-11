package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengzc
 * @date 2019-09-11 11:01
 * @since
 */
@Component
@FeignClient(value = "eureka-client-user-service",fallback = UserRemoteClientFallBack.class)
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    String hello(@RequestParam("randomNum") Integer randomNum);

}
