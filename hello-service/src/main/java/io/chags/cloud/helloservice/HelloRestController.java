package io.chags.cloud.helloservice;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping
	public String hello(@RequestHeader("x-location") String location) {
		return "Hello - " + location;
	}
}
