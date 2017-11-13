import java.util.Scanner;

public class Numeric_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	Q.	Write a Java program to sort a numeric array and a string array
//
//		 Write a Java method to find the smallest number among three numbers. 
//		Test Data:
//		Input the first number: 25
//		Input the Second number: 37
//		Input the third number: 29 
//		Expected Output:
		
        Scanner in = new Scanner (System.in);
		
		System.out.print("Input the 1st number: ");
		  int num1 = in.nextInt();
		   
		  System.out.print("Input the 2nd number: ");
		  int num2 = in.nextInt();
		   
		  System.out.print("Input the 3rd number: ");
		  int num3 = in.nextInt();
		   
		   
		  if (num1 < num2)
		   if (num1 < num3)
		    System.out.println("The smallest: " + num1);
		   
		  if (num2 < num1)
		   if (num2 < num3)
		    System.out.println("The smallest: " + num2);
		   
		  if (num3 < num1)
		   if (num3 < num2)
		    System.out.println("The smallest: " + num3);
		
		   
		  
			}
	}


