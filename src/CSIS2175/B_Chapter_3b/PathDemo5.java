package CSIS2175.B_Chapter_3b;
//Date : 2020.05.27
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p19)
//Subject : File Input and Output - PathDemo5

import java.nio.file.*;		// �̰� �߰��ص� attribute Ŭ������ ���� �� �߰��������.
import java.nio.file.attribute.*;		// ���� ������ Ȯ���Ҷ� ���� Ŭ����!!
import java.io.IOException;	// nio �ƴ�!!

public class PathDemo5 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\example\\data.txt");
		//Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\example");
		// ���ϸ� (���+���ϸ�) �̳� ��θ� ��������
		
		try
		{
			BasicFileAttributes attr = 
					Files.readAttributes(filePath,  BasicFileAttributes.class);
			// �⺻�������� ��ü�� �������. ��ҿ� ���� ���߿� �ѹ� �ٽ� �ڼ��� ����.
			
			System.out.println("Creation time " + attr.creationTime());		// ���� ���� �ð�(����)
			System.out.println("Last modified time " + attr.lastModifiedTime());	// ������ ���� �ð�(����)
			System.out.println("Size " + attr.size());	// ���� ������ (����Ʈ����)
		}
		catch (IOException e)
		{
			System.out.println("IO Exception");
		}

	}

}
