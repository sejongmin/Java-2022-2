package Ex14;

import java.lang.*;
import java.io.*;

public class Ex14_05 {

	public static void main(String[] args) {
		Integet int1 = new Integer(100);
		Double dbl1 = new Double(3.14);
		Character chr1 = new Character((char) 65);
		
		System.out.println(int1.toString());
		System.out.println(Integer.toHexString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(dbl1.longValue());
		System.out.println(chr1.charValue());
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.parseDouble("3.14"));
	}

}
