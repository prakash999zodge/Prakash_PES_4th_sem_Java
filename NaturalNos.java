//Program to display sum of 1000 natural numbers
class NaturalNos
{
	public static void main(String[] args)
	{
		int i=0,sum=0,n=1000;
		
		for(i=0;i<=n;i++)
		{
			sum = sum + i;
		}
		System.out.println("Sum of "+n+" natural numbers is = "+sum);
	}
}
