import java.io.File;
import java.io.IOException;
import java.util.Date;
/*
Project Euler Problem 59
========================

Each character on a computer is assigned a unique code and the preferred
standard is ASCII (American Standard Code for Information Interchange).
For example, uppercase A = 65, asterisk (*) = 42, and lowercase k = 107.

A modern encryption method is to take a text file, convert the bytes to
ASCII, then XOR each byte with a given value, taken from a secret key. The
advantage with the XOR function is that using the same encryption key on
the cipher text, restores the plain text; for example, 65 XOR 42 = 107,
then 107 XOR 42 = 65.

For unbreakable encryption, the key is the same length as the plain text
message, and the key is made up of random bytes. The user would keep the
encrypted message and the encryption key in different locations, and
without both "halves", it is impossible to decrypt the message.

Unfortunately, this method is impractical for most users, so the modified
method is to use a password as a key. If the password is shorter than the
message, which is likely, the key is repeated cyclically throughout the
message. The balance for this method is using a sufficiently long password
key for security, but short enough to be memorable.

Your task has been made easy, as the encryption key consists of three
lower case characters. Using cipher1.txt, a file containing the encrypted
ASCII codes, and the knowledge that the plain text must contain common
English words, decrypt the message and find the sum of the ASCII values
in the original text.
*/
import java.util.Scanner;

public class Euler059 {
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
                        if (counter == 10) {
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
