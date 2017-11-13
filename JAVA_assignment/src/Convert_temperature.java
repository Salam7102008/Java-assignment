import java.util.Scanner;

public class Convert_temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	Q.	Write a Java program to convert temperature from Fahrenheit to Celsius
//		degree. 
//		Test Data
//		Input a degree in Fahrenheit: 212
//		Expected Output:
//		212.0 degree Fahrenheit is equal to 100.0 in Celsius
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("Input a degree in Fahrenheit:");
	double fahrenheit = input.nextDouble();
	
	double celsius = ((5 *(fahrenheit - 32.0)) / 9.0);
	System.out.println("degree Fahrenheit is equal to "+ celsius +" in celsius");
	
	
	}

}
