import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int targetNumber = (int) (Math.random() * 50 + 1);
		System.out.println("het targetNumber is " + targetNumber);

		Scanner input = new Scanner(System.in);
		int guess;
		int numberOfTries = 1;
		do {
			System.out.print(numberOfTries + "st guess. Enter a number: ");
			guess = input.nextInt();
			numberOfTries++;
			
			if (numberOfTries > 10) {
				System.out.println("You haved exceeded the number of guesses");
		break;
			}
			if (guess < 1 || guess > 50) {
				System.out.println("Invalid input");
				break;

			}

			if (guess == targetNumber)
				System.out.println("Correct!");

			else if (guess > targetNumber)
				System.out.println("Lower");

			else if (guess < targetNumber)
				System.out.println("Higher");

		} while (numberOfTries < 11 || guess != targetNumber);

		input.close();

	}

}
