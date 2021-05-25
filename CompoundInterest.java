//Program to generate compound interest
//formulae : P (1 + R/n) (nt) - P
//whereas, Here P is principal amount.
//R is the annual interest rate.
//t is the time the money is invested or borrowed for.
//n is the number of times that interest is compounded per unit t
import java.util.*;
class CompoundInterest
{
	public static void main(String[] args)
	{
		double principalAmount,annualInterestRate,time,numberOfTimes,compoundInterestis;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount : ");
		principalAmount = sc.nextFloat();
		System.out.println("Enter annual interest rate : ");
		annualInterestRate = sc.nextFloat();
		System.out.println("Enter time : ");
		time = sc.nextFloat();
		System.out.println("Enter number of times : ");
		numberOfTimes = sc.nextFloat();
		double nt = (numberOfTimes*time);
		double onePlusRbyN = 1+(annualInterestRate/numberOfTimes);
		compoundInterestis = principalAmount * Math.pow(onePlusRbyN,nt);
		compoundInterestis = compoundInterestis-principalAmount;
		System.out.println("Compound Interest is : $"+compoundInterestis);
	}
}
