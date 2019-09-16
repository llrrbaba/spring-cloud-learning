package cn.rocker.springcloudlearningeurekaclientarticleservice.service;

import feign.hystrix.FallbackFactory;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author rocker
 * @date 2019/09/15 15:22
 * @since V1.0
 */
@Slf4j
@Component
public class UserRemoteServiceFallbackFactory implements FallbackFactory<UserRemoteService> {
    @Override
    public UserRemoteService create(Throwable throwable) {
        log.error("UserRemoteService:{}", throwable.getCause());
        return new UserRemoteService() {
            @Override
            public String hello(Integer randomNum) {
                return String.format("fallback for #hello:%s", randomNum);
            }
        };
    }
}
