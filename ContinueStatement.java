//Program to demonstate the use of continue statement
class ContinueStatement
{
	public static void main(String[] args)
	{
		int i,n=10;
		for(i=0;i<=n;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println("i = "+i);
		}
	}
}
