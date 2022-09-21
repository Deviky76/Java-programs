//Accessing Elements present in a ArrayList using for each loop.

package java_prac;

import java.util.ArrayList;

public class For_Each_Loop2 {

	public static void main(String[] args) 
	{
		ArrayList<String> carlist = new ArrayList<>();
		
		carlist.add("BMW");
		carlist.add("Innova");
		carlist.add("Swift");
		carlist.add("Volva");
		carlist.add("Maruthi");
		
		for(String car : carlist)
		{
			System.out.println(car);
		}
	}

}
