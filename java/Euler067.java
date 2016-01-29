import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/*
Project Euler Problem 67
========================

By starting at the top of the triangle below and moving to adjacent
numbers on the row below, the maximum total from top to bottom is 23.

                                    3
                                   7 4
                                  2 4 6
                                 8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom in triangle.txt, a 15K text file
containing a triangle with one-hundred rows.

NOTE: This is a much more difficult version of Problem 18. It is not
possible to try every route to solve this problem, as there are 2^99
altogether! If you could check one trillion (10^12) routes every second it
would take over twenty billion years to check them all. There is an
efficient algorithm to solve it. ;o)
*/

public class Euler067 {
    public static void main(String[] args) throws FileNotFoundException {
        Date start, end;
        start = new Date();
        ArrayList<ArrayList<Integer>> pyramid = new ArrayList<ArrayList<Integer>>();
        File file = new File("p067_triangle.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()){
        	String str = scan.nextLine();
        	ArrayList<Integer> temp = new ArrayList<Integer>();
        	for(String s: str.split(" ")){
        		temp.add(Integer.parseInt(s));
        	}
        	pyramid.add(temp);
        }
        for(int i = pyramid.size() -2; i >=0; i--){
        	for(int j = 0; j <= i; j++ ){
        		pyramid.get(i).set(j, pyramid.get(i).get(j) + Math.max(pyramid.get(i+1).get(j), pyramid.get(i+1).get(j+1)));
        	}
        }
        System.out.println(pyramid.get(0).get(0));
        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
