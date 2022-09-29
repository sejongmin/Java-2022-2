package Problem;

public class Problem_14 {

	public static void main(String[] args) {
		for(int i = 2; i<10; i++) {
			System.out.printf("#제%d단#  ", i);
		}
		System.out.printf("\n");
		for(int i = 1; i<10; i++) {
			for (int j = 2; j<10; j++) {
				System.out.printf("%dX%2d=%2d ",j, i, i*j);
			}
			System.out.printf("\n");
		}

	}

}
