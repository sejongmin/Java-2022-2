package Ex03;
import java.math.BigDecimal;

public class Ex03_11 {

	public static void main(String[] args) {
		float a = 0.1234567890123456789012345f;
		float b = 0.1234567890123456789012345f;
		
		BigDecimal bd = new BigDecimal("0.1234567890123456789012345");
		
		System.out.printf("%30.25f \n", a);
		System.out.printf("%30.25f \n", b);
		System.out.printf("%30.25f \n", bd);

	}

}
