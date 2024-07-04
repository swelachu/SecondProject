package org.execute;

import org.page.LoginPage;

import org.testng.annotations.Test;

public class ExecutionClass {
	LoginPage page = new LoginPage();
	
	
	@Test
	public void checkMultipleUser() throws Exception {
		page.checkEmptyDetails("invalid", "invalid");
		page.enterCorrectPasswordEmptyUsername("invalid", "testuser");
		page.checkValidUserInHomePage("vinaya+test@nuventure.in", "testuser");
		page.enterWrongPasswordWrongUsername("vinayanuventure.in", "test");
		 
		
	
	}
	
	
}

