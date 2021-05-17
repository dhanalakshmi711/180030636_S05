import java.util.Scanner;

public class Six {
	public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.length() > b.length())
        System.out.println(b+a+b);
        else
        System.out.println(a+b+a);
        sc.close();
    }
}