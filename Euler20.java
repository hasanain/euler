import java.math.BigInteger;


public class Euler20 {
	public static void main(String [] args){
		BigInteger integer = factorial(100);
		BigInteger sum = new BigInteger("0");
		while(!integer.equals(new BigInteger("0"))){
			sum = sum.add(integer.mod(new BigInteger("10")));
			integer = integer.divide((new BigInteger("10")));
		}
		System.out.println(sum);
	}
	public static BigInteger factorial(int n){
		BigInteger fact = new BigInteger("1");
		for(int i = 1; i <= n ; i++){
			fact = fact.multiply(new BigInteger(Integer.toString(i)));
		}
		return fact;
	}
}
