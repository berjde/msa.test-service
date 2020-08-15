package com.cp.testservice.service;

import com.cp.testservice.model.Test;
import com.cp.testservice.repository.TestR2dbcRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    final private TestR2dbcRepository r2dbcRepository;
    @Override
    public Mono<Test> getTest() {
        return r2dbcRepository.findById(1L);
    }
}
