import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Euler47 {

	public static void main(String[] args) {
		Date start, end;
		start = new Date();
		

		end = new Date();
		System.out.println(getFactors(93845346));
		System.out.println("Execution Time: "
				+ (end.getTime() - start.getTime()));
	}

	private static ArrayList<Integer> getFactors(long n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		File file = new File("./src/listOfPrimes.txt");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		while(scanner.hasNextInt()){
			primeList.add(scanner.nextInt());
		}
		int i = 0;
		while(n != 1){
			if(n%primeList.get(i) == 0){
				list.add(primeList.get(i));
				n= n/primeList.get(i);
				i =0;
			}
			else{
				i++;
			}
			
		}
		
		return list;
	}

	public static boolean isPrime(long num) {

		if (num == 0 || num == 1)
			return false;
		if (num < 4)
			return true;
		if (num % 2 == 0)
			return false;
		if (num < 9)
			return true;
		if (num % 3 == 0)
			return false;
		else {

			int sqrt = (int) Math.floor(Math.sqrt(num));
			int f = 5;

			while (f <= sqrt) {
				if (num % f == 0)
					return false;
				if (num % (f + 2) == 0)
					return false;
				f += 6;
			}
			return true;
		}
	}

}
