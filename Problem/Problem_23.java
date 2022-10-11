package Problem;

import java.util.Scanner;

public class Problem_23 {
	static void reverse(String str) {
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		str = s.nextLine();
		System.out.printf("내용을 거꾸로 출력 ==> ");
		reverse(str);

	}

}
