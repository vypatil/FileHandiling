package java.pro.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		
		File myfile = new File("E:\\Jdk Notes\\New folder:abc.txt");
		
		myfile.createNewFile();
		
		
		
		
	}
}
