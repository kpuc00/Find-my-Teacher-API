package com.findmyteacher.api.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", maxAge = 3600)
@Controller
public class MessageMapper {

	//add/edit teacher's location
	@MessageMapping("/edit/location")
	@SendTo("/locations")
	public String getTeacher(String teacher) {
		return teacher;
	}
}
