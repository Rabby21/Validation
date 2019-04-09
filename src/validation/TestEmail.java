package validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmail {

	@Test
	void test() {
		//fail("Not yet implemented");
		EmailValidation email=new EmailValidation();
		assertEquals("success",email.validate());
		//assertEquals("fail",email.validate1());
	}

}
