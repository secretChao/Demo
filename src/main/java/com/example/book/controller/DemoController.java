package com.example.book.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {
	@GetMapping
	public Map hello() {
		Map map = new HashMap();
		map.put("say", "hello");
		return map;
	}
}
