package Problem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Problem_28 {

	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("data/in.txt");
		BufferedReader bReader = new BufferedReader(fReader);
		FileWriter fw = new FileWriter("data/out.txt");
		String str1 = null;
		while ((str1 = bReader.readLine()) != null) {
			String str2 = "";
			for (int i = str1.length() - 1; i >= 0; i--) {
				str2 += str1.charAt(i);
			}
			fw.write(str2 + "\n");
		}
		
		bReader.close();
		fReader.close();
		fw.close();
	}
}
