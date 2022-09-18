//Using equals() and equalsIgnoreCase() comparing string

package java_prac;

public class String_equals {

	public static void main(String[] args) 
	{
		String expval, actval;
		expval ="invalid credentials";
		actval ="Invalid credentials";
		
		if(expval.equals(actval))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
			
		}
		

		if(expval.equalsIgnoreCase(actval))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
			
		}

	}

}
