class QuotientRemainder
	{
		public static void main(String[] args)
		{
			int divisor=4,divident=25;
			int quotient,remainder;
			System.out.println("Finding Quotient & Remainder having");
			System.out.println("divident = "+divident+", divisor = "+divisor);
			quotient=divident/divisor;
			remainder=divident%divisor;
			System.out.println("Quotient = "+quotient+", Remainder = "+remainder);
		}
	}