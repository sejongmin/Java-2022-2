package Problem;
import java.util.Scanner;
public class Problem_17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start_num, finish_num, gap;
		int sum = 0;
		
		System.out.printf("합계의 시작값 ==> ");
		start_num = s.nextInt();
		System.out.printf("합계의 끝값 ==> ");
		finish_num = s.nextInt();
		System.out.printf("배수 ==> ");
		gap = s.nextInt();
		
		for(int i = start_num; i<=finish_num; i+=gap)
			sum += i;
		
		System.out.printf("%d부터 %d까지의 %d의 합계 ==> %d",start_num, finish_num, gap, sum);
	}

}
