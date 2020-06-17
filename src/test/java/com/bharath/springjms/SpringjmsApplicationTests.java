package com.bharath.springjms;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.springjms.senders.MessageSender;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringjmsApplicationTests {
	
	@Autowired
	MessageSender sender;

	@Test
	void testSendAndReceive() {
		sender.send("Helo Spring JMS!!");
	}

}
