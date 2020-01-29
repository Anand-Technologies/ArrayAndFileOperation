package fileOperation;

import java.io.File;
import java.io.IOException;

public class CreateNewFolder {
	public static void main(String [] args) throws IOException {
	
		//To check whether new folder created or not
		 File f = new File("D:\\Greens");
		 boolean b= f.mkdir();
		 System.out.println(b);
		 
		 //To check whether Folder create inside another folder
		 File f1 = new File("D:\\Greens\\OMR");
		 boolean b1 = f1.mkdirs();
		 System.out.println(b1);
		 
		 //To create new file (.txt, .doc, .pdf)
		 File f2 = new File("D:\\Greens\\OMR\\Java.doc");
		 boolean b2 = f2.createNewFile();
		 System.out.println(b2);
		 
		 //To check whether it is file or not
		 File f3 = new File("D:\\Greens\\OMR\\Java.doc");
		 boolean b3 = f3.isFile();
		 System.out.println(b3);
		 
		 //Task : To create new PDF File and Check is there or not
		 File f4 = new File("D:\\Greens\\OMR\\JavaSel.pdf");
		 boolean b4 = f4.createNewFile();
		 System.out.println(b4);
		 //File f5 = new File("D:\\Greens\\OMR\\JavaSel.pdf");
		 boolean b5 = f4.isFile();
		 System.out.println(b5);
		 
		 
		 

	}
}
