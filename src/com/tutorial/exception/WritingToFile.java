package com.tutorial.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//write data to file
public class WritingToFile {
	
	void createFile()
	{  FileWriter fw=null;
	
		 try {
			fw = new FileWriter("efg.txt.",true);// to append in file
			fw.write("   what are you doing   ");
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally
		 {
			 try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println("file done finally");
		 }
		
	}
		
	static void readFromFile()
	{
		FileReader fr=null;
		
		try {
			fr = new FileReader("efg.txt");
			
			int i;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			System.out.println("");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	public static void main(String[] args) {
		WritingToFile f = new WritingToFile();
		f.createFile();
		readFromFile();
		System.out.println("rest of code....");

	}

}
