package assignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

// program to search word in a file

public class WordSearchInFile {

	static void wordSearch()
	{  String s;
		boolean flag=false;
		FileWriter fw=null;
		
		try {
			fw=new FileWriter("pqr.txt");
			 fw.write("hello this is shreya what are you doing");
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
		}
		Scanner sc = new Scanner(System.in);
		
		FileReader fr = null;
	
		try {
			fr=new FileReader("pqr.txt");
			Scanner str = new Scanner(fr);
			System.out.println("enter the word to be searched");
			 s = sc.next();
		
			while(str.hasNext())
			{
				if(s.equals(str.next()))
						{
							System.out.println("word is present in file");
							flag=true;
							break;
					
						}
				
			}
						if(flag ==false)
							System.out.println("word not present in file");
						fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
	
	
	
	public static void main(String[] args) {
	
		wordSearch();
	}

}
