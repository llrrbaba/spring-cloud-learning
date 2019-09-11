package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chengzc
 * @date 2019-09-11 11:01
 * @since
 */
@FeignClient("eureka-client-user-service")
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    String hello();

}
