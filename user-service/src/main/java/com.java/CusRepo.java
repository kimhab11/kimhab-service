package com.java;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CusRepo extends JpaRepository<Customer, Integer> {
}
