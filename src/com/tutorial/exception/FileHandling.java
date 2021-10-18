package com.tutorial.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// file handling - byteStream/charstream
//Write
//Read
//FileInputStream->Write
//FileOutputStream->Read
//FileWriter->write
//FileReader->read

public class FileHandling {

	void createFile()
	{
		FileOutputStream out = null;
		try{
			out=new FileOutputStream("abc.txt");
			String s= "welcome to java";
			byte b[] = s.getBytes();
			out.write(b);
			System.out.println("file created");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally 
		{
			try{
				out.close();}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void readFromFile()
	{
		FileInputStream in=null;
		try
		{
			in = new FileInputStream("abc.txt");
			int i;
			while((i=in.read())!=-1)
        {
	     System.out.print((char)i);
        }
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		FileHandling f = new FileHandling();
		f.createFile();
		f.readFromFile();
	}

}
