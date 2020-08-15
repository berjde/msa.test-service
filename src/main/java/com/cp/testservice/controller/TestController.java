package com.cp.testservice.controller;

import com.cp.testservice.model.Test;
import com.cp.testservice.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
public class TestController {
    final private TestService testService;

    @GetMapping("/webflux")
    public Mono<Test> getTest(){
        return this.testService.getTest();
    }
}
