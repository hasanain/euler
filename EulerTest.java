import java.util.Date;

public class EulerTest {
	public static void main(String[] args) {
		Date start, end;

		start = new Date();

		System.out.println(rmX("xrayxxxxxhxx"));
		System.out.println(rmXrev("xrayxxxxxhxx"));
		end = new Date();

		System.out.println("Execution time = "
				+ (end.getTime() - start.getTime()));
	}

	public static String rmX(String str) {
		if (str.length() == 0) {
			return "";
		} else if (str.charAt(0) == 'x') {
			return rmX(str.substring(1));
		} else {
			return str.charAt(0) + rmX(str.substring(1));
		}
	}
	public static String rmXrev(String str) {
		if (str.length() == 0) {
			return "";
		} else if (str.charAt(str.length()-1) == 'x') {
			return rmXrev(str.substring(0,str.length()-1));
		} else {
			return str.charAt(str.length()-1) + rmXrev(str.substring(0, str.length()-1));
		}
	}
}