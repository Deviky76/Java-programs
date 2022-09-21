package java_prac;

public class Switch_Case1 {

	public static void main(String[] args) 
	{
		String course = "Q";
		
		switch (course.toLowerCase())
		{
		case "s":
			System.out.println("Selenium");
			break;
		case "q":
			System.out.println("QTP");
			break;
		case "l":
			System.out.println("LoadRunner");
			break;
		default:
			System.out.println("Invalid Key");
		
		}
		

	}

}
