package com.cp.testservice.service;

import com.cp.testservice.model.Test;
import reactor.core.publisher.Mono;

public interface TestService {
    Mono<Test> getTest();
}
