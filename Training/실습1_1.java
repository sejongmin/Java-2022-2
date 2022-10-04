package Training;

import java.util.Scanner;

public class 실습1_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int [5];
		int max = 0;
		
		System.out.printf("양수 5개를 입력하세요.\n");
		for(int i = 0; i<5; i++) {
			arr[i] = s.nextInt();
			if (max < arr[i])
				max = arr[i];
		}
		System.out.printf("가장 큰 수는 %d입니다.\n", max);
	}

}
