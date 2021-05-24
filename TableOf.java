//Program to demostrate table of 1 or any
import java.util.*;
class TableOf
{
	public static void main(String[] args)
	{
		float tableOf,calculateTable;
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table which should i create for you : ");
		tableOf = sc.nextFloat();
		System.out.println("Table of "+tableOf+" is below");
		for(i=1;i<=10;i++)
		{
			calculateTable = tableOf * i;
			System.out.println(tableOf+"  *  "+i+"  =  "+calculateTable);
		}
		
	}
}
