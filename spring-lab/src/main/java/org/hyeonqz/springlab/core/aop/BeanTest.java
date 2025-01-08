package org.hyeonqz.springlab.core.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanTest {

	// 스프링이 빈에 등록할 떄는 Type 과 메소드 이름을 본다.
	// 즉 아래 메소드는 String 타입을 a() 라는 메소드가 빈에 등록된다.
	@Bean
	public String a() {
		return null;
	}

	// 아래 메소드는 String 타입을 b() 라는 메소드가 빈에 등록됨
	@Bean
	public String b() {
		return null;
	}

	// 즉 메소드 이름이 다르다면 같은 값을 반환해도 빈에 등록되는대 아무 문제 없음
	// 추가적으로 반환타입이 void 이면 빈에 등록될수 없다 왜냐? 값이 없으니,, 또는 인스턴스 생성을 못하므로
}
