package validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static final Pattern email= 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
            
		public static String validate() {
			    String eml="rabby@gmail.com";
		        Matcher matcher = email.matcher(eml);
		        if(matcher.find())
		        {
		        	return "success";
		        }
		        else
		        {
		        	return "fail";
		        }
		}

}
