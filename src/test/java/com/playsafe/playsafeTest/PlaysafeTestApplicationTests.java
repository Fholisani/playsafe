package com.playsafe.playsafeTest;

import com.playsafe.playsafeTest.conversions.service.ConversionsService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlaysafeTestApplicationTests {
	@Autowired
	private ConversionsService conversionsService;

	@Test
	void contextLoads() throws Exception {
		Assert.assertNotNull(conversionsService.convertCtoK(36));
	}

	@Test
	public void testktoc() throws Exception {
		Assert.assertNotNull(conversionsService.convertKtoC((float) 363.25));

	}
	@Test
	public void testktom() throws Exception {
		Assert.assertNotNull(conversionsService.convertKtoM(5));
	}
	@Test
	public void testmtok() throws Exception {
		Assert.assertNotNull(conversionsService.convertMtoK(5));
	}

}
