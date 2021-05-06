package fileIO;

import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader r = new FileReader("src/fileIO/bufferedFile.txt");
			BufferedReader b = new BufferedReader(r);
//			System.out.println(b.readLine());
			System.out.println("--------");
			char cbuf[];
			cbuf = new char[100];
			b.read(cbuf, 0,100);
			System.out.println(cbuf);
			b.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
