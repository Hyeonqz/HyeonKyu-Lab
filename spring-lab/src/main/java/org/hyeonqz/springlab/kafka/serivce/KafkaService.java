package org.hyeonqz.springlab.kafka.serivce;

import org.hyeonqz.springlab.kafka.consumer.KafkaConsumer;
import org.hyeonqz.springlab.kafka.producer.KafkaProducer;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class KafkaService {
	private final KafkaProducer kafkaProducer;
	private final KafkaConsumer kafkaConsumer;

	public void getKafkaMessage() {
		kafkaProducer.createMessage();
	}



}
