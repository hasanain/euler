
public class Euler14 {
	public static void main(String [] args){
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
		System.out.println(num);
	}
	public static int collatzCounter(long start){
		int counter = 1;
		System.out.print(start+"\t");
		while(start != 1){
			start = (start%2 == 0) ? (start/2) : ((3* start) +1);
			//System.out.print("\t"+start);
//			if(counter % 15 == 0){
//				System.out.println();
//			}
			counter ++;
		}
		System.out.println(counter);
		return counter;
	}
}
