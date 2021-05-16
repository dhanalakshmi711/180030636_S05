package loop;
import java.util.Scanner;
public class Casechange {
	
	    public static void main(String[] input)
	    {
	        char ch;
	        int temp;
	        Scanner sc = new Scanner(System.in);
	        
	        ch = sc.next().charAt(0);
			
	        temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
			
	        System.out.print(ch);
	    }
	}