package org.hyeonqz.springlab.kafka.controller;

import org.hyeonqz.springlab.kafka.serivce.KafkaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class KafkaController {
	private final KafkaService kafkaService;

	@GetMapping("/")
	public void index() {
		kafkaService.getKafkaMessage();
	}
}
