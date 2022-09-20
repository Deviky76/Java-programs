package java_prac;

import java.util.ArrayList;

public class Array_Lis2 {

	public static void main(String[] args) 
	{
	
		ArrayList<String> carlist = new ArrayList<>();
				
		//Adding Elements into an Array using : add()
		carlist.add("BMW");
		carlist.add("Audi");
		carlist.add("Volva");
		carlist.add("Honda");
		
		System.out.println(carlist.contains("Maruthi"));
		
		//Checking the element is present in the given list or not
		
		if(carlist.contains("Volva"))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
	
	}

}
