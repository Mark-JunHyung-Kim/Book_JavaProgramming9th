package CSIS2175.L_Chapter_3b;
//Date : 2020.05.27
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p16)
//Subject : File Input and Output - PathDemo4

import java.nio.file.*;	// for input output handling
import java.io.IOException;	// for checking error and exception

public class PathDemo4 {

	public static void main(String[] args) {
		
		//Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\data.txt");
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\example");
		// ���ϸ� (���+���ϸ�) �̳� ��θ� ��������
		
		
		try
		{
			Files.delete(filePath);		// permission�� �ִ� ���, ���� ������ ������.
			System.out.println("Files or directory is deleted");
		}
		catch (NoSuchFileException e)
		{
			System.out.println("No such file or directory");	// �̹� �����Ǽ� ���°��, 			
		}
		catch (DirectoryNotEmptyException e)
		{
			System.out.println("Directory is not empty");	// ���� �ȿ� ������ �ִ°�� (�����Ұ�!)
		}
		catch (SecurityException e)
		{
			System.out.println("No permission to delete");	// ������ ���°��
		}
		catch (IOException e)
		{
			System.out.println("IO exception");	// �̰͵� ������ ���°��� ��.
		}
	}

}
