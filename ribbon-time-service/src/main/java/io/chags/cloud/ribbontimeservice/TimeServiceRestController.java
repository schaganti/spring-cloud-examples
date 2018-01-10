package io.chags.cloud.ribbontimeservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeServiceRestController {

	@Value("${server.port}")
	private int port;

	@GetMapping
	public String getTime() {
		return "Current time is " + new Date() + " answered by " + port;

	}
}
