import java.util.Date;

public class Euler12 {

	public static void main(String[] args) {
		Date start, end;
		start = new Date();
		int divisors = 0;
		int n = 0;
		int m =0;
		int o = 0;
		while(true){
			divisors = 0;
			m = triangle(n);
			o = (int) Math.sqrt(m);
			for(int i = 1; i < o; i++){
				if(m%i ==0){
					divisors++;
				}
			}
			if(divisors >= 250){
				break;
			}
			n++;
		}
		end = new Date();
		System.out.printf("The Traingle number is: %d\n", m);
		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));

	}
	public static int triangle(int n){
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum  +=i;
		}
		return sum;
	}

}
