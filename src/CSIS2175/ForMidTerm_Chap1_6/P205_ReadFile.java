package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P205 - ReadFile

import java.nio.file.*;
import java.io.*;

public class P205_ReadFile {

	public static void main(String[] args) 
	{
		Path file = Paths.get("E:\\Grades.txt");
		InputStream input = null;		
		try 
		{
			input = Files.newInputStream(file);			
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));			
			String s = null;			
			s = reader.readLine();			
			System.out.println(s);			
			input.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
				

	}

}
