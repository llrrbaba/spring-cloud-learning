package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import org.springframework.stereotype.Component;

/**
 * @author rocker
 * @date 2019/09/15 14:06
 * @since V1.0
 */
@Component
public class UserRemoteServiceFallback implements UserRemoteService {
    @Override
    public String hello(Integer randomNum) {
        return String.format("fallback for #hello:%s", randomNum);
    }
}
