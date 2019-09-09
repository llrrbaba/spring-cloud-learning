//package cn.rocker.springcloudlearningeureka.configuration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author rocker
// * @date 2019/09/08 19:33
// * @since V1.0
// */
////@Configuration
////@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // 关闭csrf
//        http.csrf().disable();
//        // 支持HttpBasic
//        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }
//}
