package com.example.RestfulAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest
class RestfulApiApplicationTests {

	private final static String BASE_URL = "http://localhost";

	@LocalServerPort
	private int port;

	@Test
	void contextLoads() {
	}

}
