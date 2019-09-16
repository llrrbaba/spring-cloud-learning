package cn.rocker.hystrixfeign.service;

/**
 * @author rocker
 * @date 2019/09/15 15:10
 * @since V1.0
 */
public class UserRemoteClientFallback implements UserRemoteClient {
    @Override
    public String hello(Integer randomNum) {
        return "fail";
    }
}
