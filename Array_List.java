package java_prac;

public class Array_List {

	public static void main(String[] args) 
	{
	

		String[] sname = {"Richards","John","Smith","David"};
		
		//Counting No. of Elements in a Array using : length
		int count = sname.length;
		System.out.println(count);
		//Accessing elements from an Array using : array[index]
		
		System.out.println(sname[0]);
		System.out.println(sname[1]);
		System.out.println(sname[2]);
		System.out.println(sname[3]);
		
		//Updating Existing Element using: array[index] = New Value
		sname[0] = "New Student";
		
		System.out.println(sname[0]);

	}

}
