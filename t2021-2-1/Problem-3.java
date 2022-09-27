import java.util.Scanner;

public class Assignmentthird {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int b = 0;
		System.out.println("input number");
		int a = scan.nextInt();

		if (a % 2 != 0) {
			b = a * 2 - 1;
			for (int i = 1; i <= b; i++)

				if (i % 2 != 0) {
					System.out.print(i + "," + " ");
				}
		} else {
			b = a * 2 - 3;
			for (int i1 = 1; i1 <= b; i1++)
				if (i1 % 2 != 0) {
					System.out.println(i1 + "," + " ");
				}

		}
		scan.close();
	}
}
