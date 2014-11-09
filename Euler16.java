import java.math.BigInteger;
import java.util.Date;


public class Euler16 {
	public static void main(String [] args){
		Date start, end;
		start = new Date();
		BigInteger i = new BigInteger("2");
		i = i.pow(1000);
		int sm =0;
		while(!i.equals(new BigInteger("0"))){
			sm = sm + Integer.parseInt(i.mod(new BigInteger("10")).toString());
			i = i.divide(new BigInteger("10"));
		}
		end = new Date();
		System.out.println(sm);
		System.out.println("Executuion Time: " + (end.getTime()-start.getTime()));
	}
	
}
