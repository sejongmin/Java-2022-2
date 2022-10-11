package Problem;

import java.util.Scanner;

public class Problem_24 {
	static void UtoLtoU(String str) {
		for(int i = 0; i<str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
				System.out.printf("%c",str.charAt(i)-'a'+'A');
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
				System.out.printf("%c",str.charAt(i)-'A'+'a');
			else 
				System.out.printf("%c",str.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력하세요 : ");
		str = s.nextLine();
		
		System.out.print("변환된 문자욜 ==> ");
		UtoLtoU(str);

	}

}
