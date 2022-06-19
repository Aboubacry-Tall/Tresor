package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.TestModel;

public interface TestRepository extends JpaRepository<TestModel,Long>{

}