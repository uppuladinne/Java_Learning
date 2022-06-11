import java.lang.*;
import java.util.*;

class ReadIntValue
{
	public static void main(String arg[])
	{
		

		int x;
		boolean is_it_Int = true;
		
		System.out.println ("Give an integer value for x");

			
		while (is_it_Int) 
		{
			Scanner sc = new Scanner (System.in);

			if (sc.hasNextInt()) 
			{	
	 			x = sc.nextInt();
				System.out.println ("you entered an integer of value");
				System.out.println (x);
				is_it_Int = false;	
			}
			
	      	else 
			{
				System.out.println(" Value you entered is not an integer, please enter an integer value ");
			}


		}

	}
}