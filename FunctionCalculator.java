import java.util.Scanner;

public class FunctionCalculator {

	public static void main(String[] args) {
		int result = 0;
		int choice = 1;
		Scanner scan = new Scanner(System.in);
		while (choice != 0) {
			System.out.println(
					"Enter operation: \n0. Exit\n1. Addition\n2. Subtraction\n" + "3. Multiplication\n4. Division");
			choice = scan.nextInt();
			if(choice == 0)
				continue;
			System.out.println("Enter first number: ");
			int num1 = scan.nextInt();
			System.out.println("Enter second number: ");
			int num2 = scan.nextInt();
			switch (choice) {
			case 1:
				result = add(num1, num2);
				break;
			case 2:
				result = sub(num1, num2);
				break;
			case 3:
				result = mul(num1, num2);
				break;
			case 4:
				result = div(num1, num2);
				break;
			default:
				System.out.println("Invalid Input...");
				continue;
			}
			System.out.println("Result: " + result+"\n");
		}
		scan.close();

	}

	static int add(int num1, int num2) {
		return num1 + num2;
	}

	static int sub(int num1, int num2) {
		return num1 - num2;
	}

	static int mul(int num1, int num2) {
		return num1 * num2;
	}

	static int div(int num1, int num2) {
		return num1 / num2;
	}

}
