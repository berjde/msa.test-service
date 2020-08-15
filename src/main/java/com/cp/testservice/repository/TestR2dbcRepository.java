package com.cp.testservice.repository;

import com.cp.testservice.model.Test;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestR2dbcRepository  extends R2dbcRepository<Test, Long> {
}
