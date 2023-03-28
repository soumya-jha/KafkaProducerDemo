package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "users", groupId = "group_id")
	public void consume(String message) {
		System.out.println("Message received from producer : " + message);
	}
}
