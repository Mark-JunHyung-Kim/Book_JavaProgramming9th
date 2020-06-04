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
			
			
			// InputStreamReader - newInputStream (���� ���) �� �̿��ϴ� BufferedReader ������Ʈ�� ����?
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			String s = null;
			
			s = reader.readLine();	// �ؽ�Ʈ������ ù���� �о�ͼ� string s�� ����
			
			System.out.println(s);
			
			input.close();	// ��ǲ ��� �Ŀ��� �׻� ������
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
