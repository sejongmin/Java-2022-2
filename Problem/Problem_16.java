package Problem;
import java.util.Scanner;

public class Problem_16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("글자를 입력 : ");
		String str = s.next();
		char[] arr = str.toCharArray();
		
		
		System.out.printf("입력한 문자열 ==> %s\n",str);
		System.out.printf("변환된 문자열 ==> ");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.printf("%c", arr[i]);
		}
	}

}
