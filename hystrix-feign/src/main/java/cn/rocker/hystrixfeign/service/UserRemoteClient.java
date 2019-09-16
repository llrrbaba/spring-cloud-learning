package cn.rocker.hystrixfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author rocker
 * @date 2019/09/15 15:08
 * @since V1.0
 */
@FeignClient(name = "eureka-client-user-service", fallback = UserRemoteClientFallback.class)
public interface UserRemoteClient {
    @GetMapping("/user/hello")
    String hello(@RequestParam("randomNum") Integer randomNum);
}
