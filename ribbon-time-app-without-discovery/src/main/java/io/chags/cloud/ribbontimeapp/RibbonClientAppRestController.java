package io.chags.cloud.ribbontimeapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonClientAppRestController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping
	public String service() {
		return restTemplate.getForEntity("http://time-service", String.class).getBody();
	}
}
