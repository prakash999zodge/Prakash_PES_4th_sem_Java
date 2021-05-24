class FibonacciSeries
{
	public static void main(String[] args)
	{
		int i=0,terms=7,firstTerm=0,secondTerm=1,nextTerm=0;
		for(i=0;i<=terms;i++)
		{
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;	
			System.out.println(" "+nextTerm);
		}
	}
}
