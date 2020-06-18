package com.demo.spring.aws.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PipelineApp {

	@GetMapping
	public String getMessage() {
		return "<h1>AWS Code pipeline...ECS Fargate</h1>";
		//return "<h1>AWS Code pipeline...Bean stalk</h1>";
	}
}
