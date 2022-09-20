package java_prac;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) 
	{
	
		//Syntax of Declaring an Array
		ArrayList<String> carlist = new ArrayList<>();
		
		//Adding Elements into an Array using : add()
		carlist.add("BMW");
		carlist.add("Audi");
		carlist.add("Volva");
		carlist.add("Honda");
		
		//Counting No. Of Elements present in an Array using :size()
		int count =carlist.size();
		System.out.println(count);
		
		//Retrieving  data present in an ArrayList using : ger()
		String carname = carlist.get(0);
		System.out.println(carname);
		
		//Append the value for ArrayList
		carlist.add("Maruthi");
		System.out.println(carlist.size());

		System.out.println("Before Updating...");
		System.out.println(carlist.get(4));

		
		//Updating Existing Elements
		carlist.set(4, "New Car");
		
		System.out.println("After Updating...");
		System.out.println(carlist.get(4));
		
		
		
	}
		

}
