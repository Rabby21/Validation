
package validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
	public static boolean ValidateNumber(String s)
	{
		String number="^\\+88(?:[0-9] ?){10}[0-9]$";
		//String number="/^(?:\+88|01)?(?:\d{11}|\d{13})$/";
		Pattern numberpat=Pattern.compile(number,Pattern.CASE_INSENSITIVE);
		Matcher m=numberpat.matcher(s);
		return (m.find()&&m.group().equals(s));
		
	}

}
