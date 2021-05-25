//Program to Print Armstrong Number from 1 to 1000
class Armstrong
{
	public static void main(String[] args) 
	{
		int n, count = 0, a, b, c, sum = 0;
		System.out.println("Armstrong numbers from 1 to 1000 : ");
		for(int i = 1; i <= 1000; i++)
		{
			n = i;
			while(n > 0)
			{
				b = n % 10;
				sum = sum + (b * b * b);
				n = n / 10;
			}
			if(sum == i)
			{
				System.out.print(i+" \t");
			}
			sum = 0;
		}
		System.out.println("");
	}
}
