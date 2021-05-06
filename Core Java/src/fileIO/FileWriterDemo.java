package fileIO;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer w = new FileWriter("src/fileIO/testFile.txt");
			
			String data = "File writer demo";
			w.write(data);
			w.append(" From Nashik");
			w.close();
			System.out.println("File written successfully!");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
