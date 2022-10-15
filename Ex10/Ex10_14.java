package Ex10;

import java.io.FileWriter;
import java.util.Scanner;

public class Ex10_14 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter("data/data4.txt");
		String str;
		
		while (!(str = sc.nextLine()).equals(""))
			fw.write(str+"\n");
		fw.close();
		

	}

}
