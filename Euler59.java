import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Euler59 {

    public static void main(String[] args) throws IOException {
        Date start, end;
        start = new Date();
        Scanner scanner = new Scanner(new File("./src/p059_cipher.txt"));
        String list = "";
        while (scanner.hasNext()) {
            for (String str : scanner.next().split(",")) {
                list += ((char) Integer.parseInt(str));
            }

        }
        char[] alphabet = new char[26];
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (c + i);
        }
        boolean foundFlag = false;
        String line = "";
        String psswd = "";
        int counter = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    psswd = ""
                            + (String.valueOf(alphabet[i])
                                    + String.valueOf(alphabet[j]) + String
                                        .valueOf(alphabet[k]));
                    line = "";
                    counter = 0;
                    for (int m = 0; m < list.length(); m++) {

                        line += (char) (list.charAt(m) ^ psswd.charAt(m % 3));
                        counter++;
                        if (counter == 20) {
                            if (!line.matches("^[A-Za-z.;,()?!\"\'\\s\\d]+$")) {
                                break;
                            }
                        }

                    }

                    if (line.matches("^[A-Za-z.;,()?!\"\'\\s\\d]+$")) {
                        System.out.println("line : " + line);
                        System.out.println("Password: " + psswd);

                        foundFlag = true;
                        break;
                    }
                    if (foundFlag)
                        break;
                }
                if (foundFlag)
                    break;
            }
            if (foundFlag)
                break;
        }
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            sum += line.charAt(i);
        }
        end = new Date();
        scanner.close();
        System.out.println("Sum is: " + sum);
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));

    }

}
