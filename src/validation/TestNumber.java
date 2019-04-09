package validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNumber {

	@Test
	void test() {
		//fail("Not yet implemented");
		//assertEquals(true,NumberValidation.ValidateNumber("+8801933253615"));
		NewValidate test1=new NewValidate();
		assertEquals("success",test1.Validation());
	}

}
