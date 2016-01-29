import java.util.Date;
/*
Project Euler Problem 14
========================

The following iterative sequence is defined for the set of positive
integers:

n->n/2 (n is even)
n->3n+1 (n is odd)

Using the rule above and starting with 13, we generate the following
sequence:
                  13->40->20->10->5->16->8->4->2->1

It can be seen that this sequence (starting at 13 and finishing at 1)
contains 10 terms. Although it has not been proved yet (Collatz Problem),
it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class Euler014 {
    public static void main(String [] args){
        Date start, end;
        start = new Date();
        
        int max = 0;
        int curr = 0;
        int num = 0;
        for(int i = 500000; i < 1000000; i++){
            curr = collatzCounter(i);
            if(curr > max){
                max = curr;
                num = i;
            }
        }
        end = new Date();
        System.out.println(num);
        System.out.println("Execution time: " + (end.getTime() - start.getTime()));
        
    }
    public static int collatzCounter(long start){
        int counter = 1;
        while(start != 1){
            start = (start%2 == 0) ? (start/2) : ((3* start) +1);
            counter ++;
        }
        return counter;
    }
}
