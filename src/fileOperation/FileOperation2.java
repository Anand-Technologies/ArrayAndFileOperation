package fileOperation;

import java.io.File;

public class FileOperation2 {
	public static void main (String [] args) {
		
		File f = new File("D:\\Greens\\OMR");
		//To check wheather file is able to read
		boolean b = f.canRead();
		System.out.println(b);
		
		//To check file can be able to write or not
		boolean b1 = f.canWrite();
		System.out.println(b1);
		
		//To check whether file is accessible or not
		boolean b2= f.exists();
		System.out.println(b2);
		
		//To get absolute path of file
		String x = f.getAbsolutePath();
		System.out.println(x);
		
		//To check whether file is hidden or not
		boolean b3 = f.isHidden();
		System.out.println(b3);
		
	//Used for LISTING all the folder name in given location
		File f1= new File("D:\\");
		
		//To take all the folder name in that location
		String[] li = f1.list();
		for(String x1 : li) {
			System.out.println(x1);
		}
		
		// To take all the file name with absolute path in that location
		File[] fi = f1.listFiles();
		for(File x2 : fi) {
			System.out.println(x2);
		}
	}

}
