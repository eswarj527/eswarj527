package TechM;

public class UniqueDigits {

	    public static void main(String[] args) {
	        int count = 0; // Counter for the number of unique three-digit numbers

	        // Loop through all possible combinations of digits
	        for (int i = 1; i <= 4; i++) {
	            for (int j = 1; j <= 4; j++) {
	                for (int k = 1; k <= 4; k++) {
	                    // Check if the digits are unique
	                    if (i != j && j != k && k != i) {
	                        // Form the three-digit number
	                        int number = i * 100 + j * 10 + k;
	                        System.out.print(number + "\n");
	                        count++;
	                    }
	                }
	            }
	            System.out.println("\nTotal number of unique three-digit numbers: " + count);
	    }
	}
}
