
public class String_Contains {

	public static void main(String[] args) 
	{
	
		String str1, str2, str3;
		str1 = "Welcome to Google App";
		str2 = "google";
		System.out.println(str1.contains(str2));
		
		
		// Converting the text into lower case and comparing the string
		System.out.println(str1.toLowerCase().contains(str2));
		str3 = str1.toLowerCase();
		System.out.println(str3);
				
				

	}

}
