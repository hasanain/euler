import java.util.Date;


public class Euler14 {
	public static void main(String [] args){
		Date start, end;
		start = new Date();
		
		int max = 0;
		int curr = 0;
		int num = 0;
		for(int i = 666667; i < 1000000; i++){
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
