import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Euler18 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("./src/Euler18file.txt"));
		while(scanner.hasNextInt()){
			System.out.println(scanner.nextInt());
		}
	}

}
