package Fileio;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class WriterReaderclass {

	public static void main(String[] args) throws FileNotFoundException {
    
		DataInputStream in= new DataInputStream(System.in);
		InputStream now= new FileInputStream(new File("/home/saravana/Desktop/ss.txt"));
		
	}

}
