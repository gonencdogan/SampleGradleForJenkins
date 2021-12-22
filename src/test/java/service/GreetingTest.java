package service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingTest {

	private Greeting sut;

	@BeforeEach
	void setUp() {
		sut = new Greeting();
	}


	@Test
	void shouldGreet() {
		String result = sut.greet("gonenc");

		assertThat(result).isEqualTo("Hello gonenc!");
	}
}