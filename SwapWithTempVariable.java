class SwapWithTempVariable
	{
		public static void main(String[] args)
		{
			float a=1.2f;
			float b=2.2f;
			float temp;
			System.out.println("Before Swap : a = "+a+", b = "+b);
			temp=a;
			a=b;
			b=temp;
			System.out.println("After Swap : a = "+a+", b = "+b);
		}
	}