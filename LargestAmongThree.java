//Program to find the largest number among three using nested if..else statement
//Advance activity : Checking whether 2 number are equal or all 3 numbers are equal or not
import java.util.*;
class LargestAmongThree
{
	public static void main(String[] args)
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a=sc.nextFloat();
		System.out.println("Enter second number : ");
		b=sc.nextFloat();
		System.out.println("Enter third number : ");
		c=sc.nextFloat();
		if(a>b && a>c)
		{
			System.out.println("First number = "+a+" is greater than second number ("+b+") as well as third number ("+c+")");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second number = "+b+" is greater than first number ("+a+") as well as third number ("+c+")");
		}
		else if(c>a && c>b)
		{
			System.out.println("Third number = "+c+" is greater than first number ("+a+") as well as second number ("+b+")");
		}
		else
		{
			if(a==b && a!=c)
			{
				System.out.println("First number = "+a+" and second number ("+b+") are same");
			}
			else if(a==c && a!=b)
			{
				System.out.println("First number = "+a+" and third number ("+c+") are same");
			}
			else if(b==c && b!=a)
			{
				System.out.println("Second number = "+b+" and third number ("+c+") are same");
			}
			else
			{
				System.out.println("First number = "+a+", second number ("+b+") as well as third number ("+c+") are equal");
			}
		}
	}
}
