class SwapWithoutTempVariable
	{
		public static void main(String[] args)
		{
			float a=1.2f;
			float b=2.2f;
			System.out.println("Swap without using temperory variable");
			System.out.println("Before Swap : a = "+a+", b = "+b);
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swap : a = "+a+", b = "+b);
		}
	}