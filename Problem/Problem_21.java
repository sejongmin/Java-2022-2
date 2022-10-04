package Problem;

public class Problem_21 {

	public static void main(String[] args) {
		int aa[][][] = new int[10][10][10];
		int val = 1;
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				for(int k = 0; k<10; k++) {
					aa[i][j][k] = val++; 
				}
			}
		}
		int sum = 0;
		
		for(int i = 0; i<10; i++) {
			for(int j = 0; j<10; j++) {
				for(int k = 0; k<10; k++) {
					sum += aa[i][j][k];
				}
			}
		}
		
		System.out.printf("1~1000까지 합계 : %d", sum);
	}

}
