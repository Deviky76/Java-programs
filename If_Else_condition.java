package java_prac;

public class If_Else_condition {

	public static void main(String[] args) 
	{
	
		char course = 'Q';
		if(course == 's' || course == 'S')
		{
			System.out.println("Selenium");
		}
		else if(course =='q'|| course =='Q')
		{
			System.out.println("QTP");
		}
		else if(course =='l' || course =='L')
		{
			System.out.println("LoadRunner");
		}
		else
		{
			System.out.println("Invalid Course");
		}

	}

}
