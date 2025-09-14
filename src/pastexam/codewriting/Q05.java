package pastexam.codewriting;

import java.util.Scanner;

public class Q05 {

	/*
	 * Implement the following formula using n: 
	 * 1 - (1/2) + (1/3) - (1/4) ... (1/n)
	 * 
	 * Print the result that you have computed (for example, the result for
	 * n = 2 is 0.5).
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a value for n: ");
		int n = in.nextInt();
		in.close();
		double result = 0;
		for (int start = 1; start <= n; start++) {
			if (start % 2 == 0) {
				result -= (1.0 / start); 
			} else {
				result += (1.0 / start); 
			}
		} System.out.println("Result = " + result);
	}
}
