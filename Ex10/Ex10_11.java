package Ex10;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex10_11 {

	public static void main(String[] args)throws Exception {
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		BufferedReader bReader = new BufferedReader(fReader);
		
		String str = null;
		int i =1;
		
		while ((str = bReader.readLine()) != null) {
			System.out.print(i + "행 : ");
			System.out.println(str);
			i++;
		}
		
		bReader.close();
		fReader.close();

	}

}
