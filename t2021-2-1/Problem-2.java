import java.util.Scanner;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class Assignmentsecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		int i;
		System.out.println("output:");
		for (int i1 = 1; i1< 2*n; i1++) {
			if (i1%2==0) 
			continue;
			else
			{
				System.out.println(i1);
			}
		}
		
	}

}  
