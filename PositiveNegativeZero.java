import java.util.*;

class PositiveNegativeZero
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. : ");
		float num = sc.nextFloat();
		if(num > 0)
		{
			System.out.println("Positive");
		}
		else if(num < 0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
