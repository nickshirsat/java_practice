package fileIO;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Reader r = new FileReader("src/fileIO/testFile.txt");
			int temp = r.read();
			while (temp != -1) {
				System.out.println((char)temp);
				temp = r.read();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
