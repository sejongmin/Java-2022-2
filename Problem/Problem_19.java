package Problem;
import java.util.Scanner;

public class Problem_19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자를 여러 개 입력 : ");
		String str = s.next();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			int num = arr[i] - '0';
			for(int j = 0; j<num; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		
	}

}
