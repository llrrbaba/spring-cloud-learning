package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chengzc
 * @date 2019-09-11 16:54
 * @since
 */
@Component
public class UserRemoteClientFallBack implements UserRemoteClient {
    @Override
    @GetMapping("/fallback/user/hello")
    public String hello(Integer randomNum) {
        return String.format("fallback for #hello:%s", randomNum);
    }
}
