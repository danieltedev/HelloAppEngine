package com.example.HelloAppEngine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@RestController
public class HelloAppEngineApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@GetMapping("/")
    public String hello() {
        return "Hello Spring Boot!";
    }

}
