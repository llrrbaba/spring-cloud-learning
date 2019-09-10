package cn.rocker.springcloudlearningeurekaclientarticleservice;

import cn.rocker.springcloudlearningeurekaclientarticleservice.rule.MyRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudLearningEurekaClientArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudLearningEurekaClientArticleServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule iRule(){
        RetryRule retryRule = new RetryRule(new MyRule());
        return retryRule;
    }

}
