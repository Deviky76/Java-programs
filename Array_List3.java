package java_prac;

import java.util.ArrayList;

public class Array_List3 {

	public static void main(String[] args) 
	{
	
		ArrayList<Integer> markslist = new ArrayList<>(10);
		
		markslist.add(60);
		markslist.add(70);
		markslist.add(80);
		markslist.add(90);
		
		System.out.println("Count :  "+ markslist.size());
		
		System.out.println(markslist.get(0));
		System.out.println(markslist.get(1));
		System.out.println(markslist.get(2));
		System.out.println(markslist.get(3));

	}

}
