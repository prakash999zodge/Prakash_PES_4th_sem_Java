import java.util.*;  

class ArithmaticOperations
	{  
		public static void main(String[] args)  
		{  
		int a,b,addition,multiplication,division,subtraction;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first value- ");
		a= sc.nextInt();  
		
		System.out.print("Enter second value- ");  
		b= sc.nextInt();    
		
		addition=a+b;  
		System.out.println("Addition = " +addition);  
		
		multiplication=a*b;  
		System.out.println("Multiplication = " +multiplication);  
		
		division=a/b;  
		System.out.println("Division = " +division);  
		
		subtraction=a-b;  
		System.out.println("Subtraction = " +subtraction);  
		}  
	}  
