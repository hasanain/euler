

import java.util.Date;

public class Euler2 {
	public static void main(String[] args) {
		int sum = 0; // final sum, solution to the problem
		// Goes through the fibonacci sequence and adds the even numbers until
		// 4M

		Date startTime, endTime;

		startTime = new Date();
		for (int i = 0; Fibonacci(i) <= 40000000; i++) {
			if (Fibonacci(i) % 2 == 0) {
				sum = sum + Fibonacci(i);
			}
		}
		endTime = new Date();

		System.out.println("Sum = " + sum);// outputs the sum
		System.out.println(Fibonacci(30));
		System.out.println("Execution time = "
				+ (endTime.getTime() - startTime.getTime()));

	}

	// Generates Fibonacci's sequence recursively
	public static int Fibonacci(int term) {

		if (term == 0) {
			return 0;
		}
		if (term == 1) {
			return 1;
		}
		return Fibonacci(term - 1) + Fibonacci(term - 2);

	}

}
