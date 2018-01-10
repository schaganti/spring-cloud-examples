package io.chags.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class ClientRestController {

	@Autowired
	private EurekaClient eurekaClient;

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	@RequestMapping("/")
	public String callService() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo serviceInfo = eurekaClient.getNextServerFromEureka("service", false);
		ResponseEntity<String> response = restTemplate.exchange(serviceInfo.getHomePageUrl(), HttpMethod.GET, null,
				String.class);
		return "Response from service " + response.getBody();
	}
}
