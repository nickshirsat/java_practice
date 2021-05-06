package fileIO;

import java.io.FileOutputStream;

public class ByteArrOPStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream f = new FileOutputStream("src/fileIO/testFile.txt");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
