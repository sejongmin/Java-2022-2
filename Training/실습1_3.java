package Training;

public class 실습1_3 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int sum = 0;
		float avg = 0;
		
		System.out.printf("랜덤한 정수들 : ");
		for(int i = 0; i<10; i++){
			int r = (int)(Math.random()*10 + 1);
			arr[i] = r;
			System.out.printf("%d ",arr[i]);
		}
		System.out.printf("\n");
		
		for(int i = 0; i<10; i++)
			sum += arr[i];
		
		avg = sum / (float)10;
		System.out.printf("평균은 %.1f\n", avg);
	}

}
