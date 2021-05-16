package loop;

import java.util.*;
import java.util.Scanner;

public class Composite {
		public static void main(String[] args)
		{ 
			int num ;
			Scanner sc= new Scanner(System.in);
			num=sc.nextInt();
		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) 
		{ 
			// condition for nonprime number
			if (num % i == 0) 
			{ flag = true; break; 
			} }
		    if (!flag)
		    	System.out.println(num + " is a prime.");
		    else if(num == 0)
		    	System.out.println("Neither prime nor composite");
		    else System.out.println(num + " is composite."); 
		}
		}

