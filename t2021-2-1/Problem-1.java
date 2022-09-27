import java.util.Scanner;

public class Calculator {

	private static final String ADD = null;
	private static final String SUB = null;
	private static final String MULTIPLY = null;
	private static final String DIVIDE = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		Double a = scan.nextDouble();
		System.out.println("Enter Second Number");
		Double b = scan.nextDouble();
		System.out.println("Enter ADD for addition operation");
		System.out.println("Enter SUB for Substraction operation");
		System.out.println("Enter MULTIPLY for MULTIPLICATION operation");
		System.out.println("Enter DIVIDE for DIVISON operation");
		String Choice = scan.next();
		if (Choice == ADD) {
			System.out.println(a + b);
		} else if (Choice == SUB) {
			System.out.println(a - b);
		} else if (Choice == MULTIPLY) {
			System.out.println(a * b);
		} else if (Choice == DIVIDE) {
			System.out.println(a / b);
		} 
		try {
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Denominator cannot be zero");
		} 
		{
			System.out.println("wrong choice");

		}
	}
}
