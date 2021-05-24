import java.util.*;  

public class AsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter Character : ");
	String str = sc.next();
	char ch = str.charAt(0);
	int ascii = ch;
	System.out.println("The ASCII value of " + ch + " is: " + ascii);
    	}
}
