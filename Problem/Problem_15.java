package Problem;

public class Problem_15 {

	public static void main(String[] args) {
		System.out.printf("--------------------\n");
		System.out.printf("10진수\t16진수\t문자\n");
		System.out.printf("--------------------\n");
		for (int i = 0; i<128; i++) {
			System.out.printf("%d\t%x\t%c\n",i,i,i);
		}

	}

}
