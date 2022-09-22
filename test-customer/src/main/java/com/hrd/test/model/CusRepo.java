package com.hrd.test.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CusRepo extends JpaRepository<Customer, Integer> {
}
