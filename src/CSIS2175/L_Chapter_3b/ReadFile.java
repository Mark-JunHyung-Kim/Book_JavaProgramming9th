package CSIS2175.L_Chapter_3b;
//Date : 2020.05.29
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (~p33)
//Subject : File Input and Output - ReadFile

import java.nio.file.*;
import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		
		Path file = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\Grade.txt");
		
		InputStream input = null;
		
		try
		{
			input = Files.newInputStream(file);
			
			
			// InputStreamReader - newInputStream (파일 경로) 를 이용하는 BufferedReader 오브젝트를 생성?
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String s = null;
			
			s = reader.readLine();	// 텍스트파일의 첫줄을 읽어와서 string s에 저장
			
			System.out.println(s);
			
			input.close();	// 인풋 사용 후에는 항상 닫을것
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
