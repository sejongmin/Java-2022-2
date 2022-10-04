package Training;

import java.util.Scanner;

public class 실습1_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.printf("금액을 입력하시오>>");
		int money = s.nextInt();
		
		for(int i = 0; i<unit.length; i++) {
			if(money/unit[i] != 0) {
				System.out.printf("%d원 짜리 : %d개\n", unit[i], money/unit[i]);
				money %= unit[i];
			}
		}
		
		

	}

}
