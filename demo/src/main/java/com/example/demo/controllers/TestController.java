package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.TestModel;
import com.example.demo.repositories.TestRepository;

@RestController
@RequestMapping("/tresor/")
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {
	@Autowired
	private TestRepository testRepo;
	
	
	@GetMapping("/tests")
	public List<TestModel> buys() {
		return testRepo.findAll();
	}
}