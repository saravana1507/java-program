package Fileio;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputFile {

	public static void main(String[] args) throws IOException {
		File n = new File("/home/saravana/Desktop/new.txt");
		DataInputStream in = new DataInputStream(System.in);
		FileOutputStream na = new FileOutputStream(n);
		BufferedOutputStream bos = new BufferedOutputStream(na);
       System.out.println("enter the text");
         
       int c;
       while((c=in.read())!='%')
       {
            bos.write(c);       }
	
	}

}
