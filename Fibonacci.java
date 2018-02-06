import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {

		ArrayList<Integer> fibvalues = new ArrayList<Integer>();
		Scanner fibterm = new Scanner(System.in);
		int term, answer;
		System.out.println("Give a number");
		term = fibterm.nextInt();

		int F1 = 0;
		int F2 = 1;

		for (int value = 1; value < term; value++) {
			int fibvalue = F1 + F2;
			F1 = F2;
			F2 = fibvalue;
			fibvalues.add(F1);

		}
		System.out.println("The value of the " + term + "th term of the Fibonacci sequence is " + F1);
		fibterm.close();

		int sum = 0;

		for (Iterator<Integer> iterator = fibvalues.iterator(); iterator.hasNext();) {
			Integer sumeven = iterator.next();
			if (sumeven % 2 == 0) {
				sum += sumeven;
			}
		}
		System.out.println("The sum of all even values of the first " + term + " terms is " + sum);
	}

}
