package org.hyeonqz.springlab.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class KafkaProducer {
	private final KafkaTemplate<String, String> kafkaTemplate;

	public void createMessage() {
		kafkaTemplate.send("topic-1","hello kyu?");
	}
}
