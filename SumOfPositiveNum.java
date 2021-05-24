//Program to find Sum of Positive Number Only
//using while loop
import java.util.*;
class SumOfPositiveNum
{
	public static void main(String[] args)
	{
		float a,sum=0,i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		a = sc.nextFloat();
		while(a>=0)
		{
			sum = a + sum;
			i++;
			System.out.println(" "+sum);
			System.out.println("Enter Number : ");
			a = sc.nextFloat();

		}
		System.out.println("Sum of positive numbers : "+sum);
		
		
		
	}
}
