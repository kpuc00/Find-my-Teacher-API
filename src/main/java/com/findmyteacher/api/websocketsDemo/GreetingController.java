package com.findmyteacher.api.websocketsDemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

	@MessageMapping("/edit/location")
	@SendTo("/locations")
	public String greeting(String teacher) {
		return teacher;
	}
}
