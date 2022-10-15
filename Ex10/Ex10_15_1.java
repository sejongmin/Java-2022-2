package Ex10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex10_15_1 {

	public static void main(String[] args) throws Exception{
		Scanner s = new Scanner(System.in);
		String inputFileName = s.nextLine();
		String outputFileName = s.nextLine();
		
		FileInputStream fis = new FileInputStream(inputFileName);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		int ch;
		while ((ch = fis.read()) != -1)
			fos.write((byte)ch);
		
		System.out.println("복사 완료");
		fis.close();
		fos.close();

	}

}
