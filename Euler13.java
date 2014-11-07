import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Date;
import java.util.Scanner;


public class Euler13 {
	
	public static void main(String[]args){
		Date start, end;
		start = new Date();
		File file = new File("./src/Euler13file");
		BigInteger integer = new BigInteger("0");
		BigInteger sum = new BigInteger("0");
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		while(scanner.hasNextLine()){
			integer = new BigInteger(scanner.nextLine());
			sum = sum.add(integer);
		}
		end = new Date();
		
		System.out.println(sum.toString().substring(0,10));
		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));

	}
}
