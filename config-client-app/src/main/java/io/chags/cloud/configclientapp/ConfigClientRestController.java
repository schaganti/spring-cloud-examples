package io.chags.cloud.configclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRestController {

	@Autowired
	ConfigClientAppConfiguration configClientAppConfiguration;
	
	@Value("${some.other.property}")
	String someOtherProperty;
	
	
	@RequestMapping("/")
	public String printConfig() {
		return configClientAppConfiguration.getProperty() + "||" + someOtherProperty;
	}
}
