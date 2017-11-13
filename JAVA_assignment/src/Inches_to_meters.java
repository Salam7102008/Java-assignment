import java.util.Scanner;

public class Inches_to_meters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//	Q.	Write a Java program that reads a number in inches, converts it to meters.
//		Note: One inch is 0.0254 meter.
//		Test Data
//		Input a value for inch: 1000
//		Expected Output :
//		1000.0 inch is 25.4 meters
		
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
	}

}
