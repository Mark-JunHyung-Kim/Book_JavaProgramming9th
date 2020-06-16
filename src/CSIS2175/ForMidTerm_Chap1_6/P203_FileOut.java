package CSIS2175.ForMidTerm_Chap1_6;
//Date : 2020.06.16
//Name : Mark JunHyung Kim
//Chapter : For mid-term in S2020 (Chap#1 - #6)
//Subject : P203 - FileOut

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class P203_FileOut {

	public static void main(String[] args) 
	{
		Path file = Paths.get("E:\\Grades.txt");
		String s = "ABCDE";
		byte[] data = s.getBytes();
		OutputStream output = null;
		try
		{
			output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			output.write(data);
			output.flush();
			output.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
