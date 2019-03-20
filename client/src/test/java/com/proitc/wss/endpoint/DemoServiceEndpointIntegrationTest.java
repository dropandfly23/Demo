package com.proitc.wss.endpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.proitc.wss.configuration.WebServiceConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebServiceConfiguration.class)
@SpringBootTest
public class DemoServiceEndpointIntegrationTest {
	private static final Logger log = LoggerFactory.getLogger(WebServiceConfiguration.class.getName());
	@Autowired
	@Qualifier("recepcionWSClient")
	private DemoServiceEndpointPortType demoClient;

	@Test
	public void shouldResultOK() {
		String result = demoClient.status();
		log.info("::::::: "+demoClient.toString());
		assertEquals("OK", result);
	}
}
