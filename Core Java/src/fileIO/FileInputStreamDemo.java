package fileIO;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("src/fileIO/bufferedFile.txt");
			int i = 0;
			while(i != -1) {
				System.out.print((char) fin.read());
				
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
