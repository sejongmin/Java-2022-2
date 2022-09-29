package Problem;
import java.util.Scanner;

public class Problem_18 {

	public static void main(String[] args) {
		int upper = 0;
		int lower = 0;
		int number = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열을 입력 : ");
		String str = s.nextLine();
		char[] arr = str.toCharArray();
		
		for(int i = 0; i<arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z')
				lower++;
			else if (arr[i] >= 'A' && arr[i] <= 'Z')
				upper++;
			else if(arr[i] >= '0' && arr[i] <= '9')
				number++;
		}
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", upper, lower, number);
	}
}
