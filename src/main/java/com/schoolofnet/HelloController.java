package com.schoolofnet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {
		@RequestMapping("/say")
		@ResponseBody
		
		public String hello() {
			return "Hello world by School of Net";
		}
		
		
		@GetMapping(path = "/say/{name}")
		@ResponseBody
		
		public String say(@PathVariable String name) {
			return "Hello " + name + " This is my new method";
		}
		
		@PostMapping(path = "/say/{name}")
		@ResponseBody
		
		public String sayPost(@RequestParam String name) {
			return "This is my result: " + name;
		}
}
