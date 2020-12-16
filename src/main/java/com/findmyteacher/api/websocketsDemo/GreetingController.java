package com.findmyteacher.api.websocketsDemo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class GreetingController {

	@MessageMapping("/edit/location")
	@SendTo("/locations")
	public String greeting(String teacher) {
		return teacher;
	}
}
