package com.example.drink.repository;

import com.example.drink.models.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<TestModel, Integer> {
}
