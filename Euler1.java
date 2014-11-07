

import java.util.Date;

public class Euler1 {

	public static void main(String[] args) {

		int sum = 23;
		Date start, end;

		start = new Date();

		for (int i = 10; i < 1000; i++)
			if (i % 5 == 0 || i % 3 == 0)
				sum = sum + i;

		end = new Date();

		System.out.println("The sum = " + sum);

		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));
	}
}
