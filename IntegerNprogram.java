package TechM;

import java.util.Scanner;

public class IntegerNprogram {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Enter a number
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        // Compute n + nn + nnn
	        int nn = n * 10 + n;
	        int nnn = nn * 10 + n;
	        int sum = n + nn + nnn;

	        // Display the result
	        System.out.println(n + " + " + nn + " + " + nnn + " = " + sum);
	        scanner.close();
	    }
}
