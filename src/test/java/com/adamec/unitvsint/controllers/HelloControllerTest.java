package com.adamec.unitvsint.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	@Test
	void testHello() {
		HelloController controller = new HelloController(); //Arrange
		String response = controller.hello("World"); 	//Act
		assert("Hello, World".equals(response));	//Assert		
	
	}

}
