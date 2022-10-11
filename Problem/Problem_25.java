package Problem;

public class Problem_25 {
	
	static int random() {
		int num;
		num = (int)(Math.random()*45 + 1);
		return num;
	}
	
	static boolean find(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++)
			if (arr[i] == num)
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = new int [6];
		int i = 0;
		
		System.out.print("**로또 추첨을 시작합니다. **\n\n");
		while (i < 6) {
			int num = random();
			if (find(arr, num))
				continue;
			arr[i] = num;
			i++;
		}
		
		System.out.printf("추첨된 로또 번호 ==> ");
		for(int j = 0; j<6; j++) {
			System.out.printf(" %d ", arr[j]);
		}
	}

}
