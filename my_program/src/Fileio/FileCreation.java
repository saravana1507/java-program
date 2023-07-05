package Fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {

		File file= new File("/home/saravana/Desktop/sample.txt");
	System.out.println(	file.canRead());
	System.out.println(	file.canWrite());
	System.out.println(	file.toPath());
	System.out.println(	file.getName());
	System.out.println(	file.getPath());
	FileOutputStream n= new FileOutputStream(file,true);
	String name=" i have finish in two weeks in this project";
	byte[] a=name.getBytes();
	n.write(a);
	FileInputStream nxt= new FileInputStream(file);
	//System.out.println(nxt.read());
	int c;
	while((c=nxt.read())>-1)
	{
		System.out.print((char)c);
	}
	
	}

}
