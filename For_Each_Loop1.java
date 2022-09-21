package java_prac;

public class For_Each_Loop1 {

	public static void main(String[] args) 
	{
	
		int[] marks = {40,69,4,45,69};
		
		for(int data : marks)
		{
			if(data<35)
			{
				System.out.println("Fail");
				break;
			}
		}

	}

}
