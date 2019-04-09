package validation;

public class NewValidate {
	public String Validation() {
	
	String number="01933454744";
	if(number.length()!=11)
	{
		return "invalid";
		
	}
	else if(number.startsWith("017")||number.startsWith("016")||number.startsWith("018")||number.startsWith("019"))
	{
		return "success";
	}
	else
	{
		return "invalid";
	}
	
	}

}
