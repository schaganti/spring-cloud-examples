package io.chags.cloud.goodbyservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodByeRestController {

	@RequestMapping
	public String goodBye() {
		return "Good Bye!";
	}
}
