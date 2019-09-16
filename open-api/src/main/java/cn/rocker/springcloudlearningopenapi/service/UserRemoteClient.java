package cn.rocker.springcloudlearningopenapi.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author chengzc
 * @date 2019-09-11 11:01
 * @since
 */
public interface UserRemoteClient {

    @GetMapping("/user/hello")
    String hello(@RequestParam("randomNum") Integer randomNum);

}
