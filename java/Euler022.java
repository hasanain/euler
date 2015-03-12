import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/*
 Project Euler Problem 22
 ========================

 Using names.txt, a 46K text file containing over five-thousand first names,
 begin by sorting it into alphabetical order. Then working out the
 alphabetical value for each name, multiply this value by its alphabetical
 position in the list to obtain a name score.

 For example, when the list is sorted into alphabetical order, COLIN, which
 is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So,
 COLIN would obtain a score of 938 * 53 = 49714.

 What is the total of all the name scores in the file?
 */

public class Euler022 {
	public static void main(String[] args) throws FileNotFoundException {
		Date start, end;
		start = new Date();
		File file = new File("../p022_names.txt");
		Scanner scan = new Scanner(file);
		int sum = 0;
		ArrayList<String> names = new ArrayList<String>();
		while (scan.hasNextLine()) {
			for (String s : scan.nextLine().split(",")) {
				names.add(s.substring(1, s.length() - 1));
			}

		}
		scan.close();
		Collections.sort(names);

		for (int i = 0; i < names.size(); i++) {
			sum += value(names.get(i)) * (i + 1);
		}

		System.out.println(sum);

		end = new Date();
		System.out.println("Execution Time: "
				+ (end.getTime() - start.getTime()));
	}

	public static int value(String name) {
		int a = 'A';
		int value = 0;
		for (int i = 0; i < name.length(); i++) {
			value += (name.charAt(i) - a + 1);
		}
		return value;
	}
}
