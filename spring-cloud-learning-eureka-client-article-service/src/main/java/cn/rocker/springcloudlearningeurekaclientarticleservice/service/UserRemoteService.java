package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengzc
 * @date 2019-09-11 11:01
 * @since
 */
@FeignClient(value = "eureka-client-user-service", /*fallback=UserRemoteServiceFallback.class*/fallbackFactory = UserRemoteServiceFallbackFactory.class)
public interface UserRemoteService /*extends UserRemoteClient*/ {
    @GetMapping("/user/hello")
    String hello(@RequestParam("randomNum") Integer randomNum);
}
