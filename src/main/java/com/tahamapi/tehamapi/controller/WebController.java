package com.tahamapi.tehamapi.controller;

import com.tahamapi.tehamapi.model.Hello;
import com.tahamapi.tehamapi.model.Vue;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    @MessageMapping("/hello")
	@SendTo("/topic/hi")
	public Hello greeting(Vue v) throws Exception {
		Thread.sleep(3000); // simulated delay
		return new Hello("Hi, " + v.getName() + "!");
	}


    @MessageMapping("/hello2")
	@SendTo("/topic/h2")
	public Hello greeting1(Vue v) throws Exception {
		Thread.sleep(3000); // simulated delay
		return new Hello("Hi, 2" + v.getName() + "!");
	}

    @MessageMapping("/hello3")
	@SendTo("/topic/h3")
	public Hello greeting3(Vue v) throws Exception {
		Thread.sleep(3000); // simulated delay
		return new Hello("Hi, 2" + v.getName() + "!");
	}
}
