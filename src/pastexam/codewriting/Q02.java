package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is the width or your rectangle? ");
		double width = in.nextDouble();
		System.out.print("What is the height or your rectangle? ");
		double height = in.nextDouble();
		double area = width * height;
		if (area == 0) {
			System.out.println("The area of your rectangle is " + area + "! Congratulations!");
		} else {
			System.out.println("The area of your rectangle is " + area + ". Please select values for the width and height that result in an area of 0.");
			System.out.print("What is the new width or your rectangle? ");
			width = in.nextDouble();
			System.out.print("What is the new height or your rectangle? ");
			height = in.nextDouble();	
			area = width * height;
			System.out.println("The area of your rectangle is " + area + "! Congratulations!");
		}
		
	}
}
