package org.hyeonqz.springlab.kafka.serivce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KafkaServiceTest {

	@Autowired
	private KafkaService kafkaService;

	@Test
	@DisplayName("카프카를 실행 한다.")
	void KafkaServiceRunningTest() {
	    // given

	    // when
		kafkaService.getKafkaMessage();

	    // then
	}

}