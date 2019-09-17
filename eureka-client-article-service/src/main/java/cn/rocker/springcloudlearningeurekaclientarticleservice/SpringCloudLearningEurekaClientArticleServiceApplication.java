package cn.rocker.springcloudlearningeurekaclientarticleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class SpringCloudLearningEurekaClientArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLearningEurekaClientArticleServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule iRule(){
//        RetryRule retryRule = new RetryRule(new MyRule());
//        return retryRule;
//    }

}
