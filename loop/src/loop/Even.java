package loop;
import java.util.Scanner;
public class Even {
	public static void main (String args[]){
	int r,i;
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	System.out.print("\n the even numbers between "+num1+" and "+num2+" are :");
	for(i=num1; i<=num2; i++){ 
	r=i%2; 
	if(r==0) 
	System.out.println(i);
	}
	System.out.print("\n the odd numbers between "+num1+" and "+num2+" are :");
	for(i=num1; i<=num2; i++){ 
	r=i%2; 
	if(r==1) 
	System.out.println(i);
	}
	}
}
