package fileIO;

import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f = new FileWriter("src/fileIO/bufferedFile.txt");
			BufferedWriter bf = new BufferedWriter(f);
			bf.write("Welcome to buffered writer");
			bf.close();
			System.out.println("File Written Successfully!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
