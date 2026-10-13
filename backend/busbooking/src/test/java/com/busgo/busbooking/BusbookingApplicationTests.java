package com.busgo.busbooking;

import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusbookingApplicationTests {

	static {
		TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
	}

	@Test
	void contextLoads() {
	}

}
