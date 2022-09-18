//CONVERTING THE STRING TO LOWERCASE TO UPPERCASE

package java_prac;

public class String_Datatype {

	public static void main(String[] args)
	{
		String empname = "Richards";
		System.out.println(empname);
		
		System.out.println(empname.toLowerCase());
		
		
		String x = "GOOGLE";
		System.out.println(x);
		System.out.println(x.toLowerCase());
		
		String y =x.toLowerCase();
		String z =y.toUpperCase();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
/*output
		
Richards
richards

*/
		
		

	}

}
