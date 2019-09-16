package cn.rocker.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocker
 * @date 2019/09/16 21:25
 * @since V1.0
 */
@RestController
public class LocalController {
    @GetMapping("/local/{id}")
    public String local(@PathVariable String id){
        return id;
    }
}
