package Problem;
import java.util.Scanner;

public class Problem_03 {

	public static void main(String[] args) {
		int a, b;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.print("+ - * / % ==>");
		char op = s.next().charAt(0);
		System.out.print("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();
		
		if (op == '+') {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		}
		else if (op == '-') {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		}
		else if (op == '*') {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		}
		else if (op == '/') {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}
		else if (op == '%') {
			if (b == 0) { 
				System.out.println("0으로 나누면 나머지 값이 안됩니다.");
				return;
			}
			result = a % b;
			System.out.println(a + "%" + b + "=" + result);
		}
	}
}
