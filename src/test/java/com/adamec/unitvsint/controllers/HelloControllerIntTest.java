package com.adamec.unitvsint.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerIntTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	void testHello() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/hello");
		MvcResult result = mvc.perform(request).andReturn();
		assert("Hello, World".equals(result.getResponse().getContentAsString()));	//Assert		
	}
	
	@Test
	public void testHelloWithName() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/hello?name=Jessica");
		MvcResult result = mvc.perform(request).andReturn();
		assert("Hello, Jessica".equals(result.getResponse().getContentAsString()));	//Assert
	}

}
