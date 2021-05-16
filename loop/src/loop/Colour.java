package loop;

import java.util.Scanner;

public class Colour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        char ch = sc.next().charAt(0);
        if(ch=='R' || ch=='r')
              System.out.println("Red") ;
             
        else if(ch=='G'|| ch=='g') 
        	System.out.println("Green");
              
        else if(ch=='B' || ch=='b')
        	System.out.println("Blue");
        else
        	System.out.println("Invalid");
       }
	}

