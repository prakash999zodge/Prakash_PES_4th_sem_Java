import java.util.*;

class CalAverage
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3,num4,num5;
		float avg;
		System.out.println("Enter first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		num2 = sc.nextInt();
		System.out.println("Enter third number : ");
		num3 = sc.nextInt();
		System.out.println("Enter fourth number : ");
		num4 = sc.nextInt();
		System.out.println("Enter fifth number : ");
		num5 = sc.nextInt();
		avg = (num1 + num2 + num3 + num4 + num5)/5;
		System.out.println("Average is : "+avg);
	}
}
