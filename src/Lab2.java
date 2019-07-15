import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double length;
		double width;
		double height;
		boolean keepGoing = true;
		
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		while (keepGoing == true) {
			System.out.println("Enter Length: ");
			length = scan.nextDouble();
			System.out.println("Enter Width: ");
			width = scan.nextDouble();
			System.out.println("Enter Height: ");
			height = scan.nextDouble();
		
			double area = length * width;
			double perimeter = (2 * length) + (2 * width);
			double volume = length * width * height;
		
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			System.out.println();
			System.out.println("Continue? (y/n): ");
			scan.nextLine();
			
			String userInput = scan.nextLine();
			if (userInput.equals("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
			System.out.println();
		}
		System.out.println("Goodbye!");
		scan.close();
	}
}
