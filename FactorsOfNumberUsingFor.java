// Java Program to Find factors of a number using For Loop

import java.util.*;

public class FactorsOfNumberUsingFor 
{	
	public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);
		System.out.print("Please enter any number to find factors: ");
		int num = kb.nextInt();
		
		for(int i = 1; i <= num; i++) 
        {
			if(num % i == 0) 
            {
				System.out.printf(" %d  ", i);
			}
		}
	}
}