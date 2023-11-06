package regexDemo;
import java.util.regex.*;

public class regex1 {

	public static void main(String[] args) {
	
		Pattern p = Pattern.compile("[abc]");
		Matcher maches  = p.matcher("a");       // 1st way
		
		System.out.println(maches.matches());
		
	// 2nd way
	// boolean b2=Pattern.compile(".s").matcher("as").matches();  
		
	// 3rd way
	//	boolean b3 = Pattern.matches(".s", "as");  
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)\
		
		String myText = "welcomeA welcomeBC";
		String input = "12345ABC";
		String mobNo = "1234567893";
		
		Pattern obj = Pattern.compile("welcome."); //   for digit \\d
		Matcher m = obj.matcher(myText);
		
		if(m.find())
		{
			System.out.println(myText.substring(m.start(),m.end()));
		}

		Pattern obj1 = Pattern.compile("[\\d]{10}");
		Matcher maches1 = obj1.matcher(mobNo);
		
		if(maches1.matches())
		{
			System.out.println("It is a mobile number");
		}
		else
		{
			System.out.println("It is not a mobile number");
		}
	}

}
