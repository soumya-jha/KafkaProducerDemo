package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	@Autowired
	private Producer producer;

	@RequestMapping(value = "/sendMessage" , method = RequestMethod.GET)
	public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
		producer.sendMessage(message);
	}
}
