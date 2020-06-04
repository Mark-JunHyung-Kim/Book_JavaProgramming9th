package CSIS2175.L_Chapter_3b;
//Date : 2020.05.26
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p14)
//Subject : File Input and Output - PathDemo3

import java.nio.file.*;
import static java.nio.file.AccessMode.*;	// ���� ������ ���ɿ��� üũ!
import java.io.IOException;	// ����¿��� - ����������

public class PathDemo3 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\data.txt");
		System.out.println("Path is " + filePath.toString());	// ���� ��� ���� �� ��� ���
		
		try
		{
			filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE, WRITE);
			// checkAccess method ���� argument ������ ���� �ɼ��� �޶���
			// READ - Checks that the file exists and that the program has permission to read the file
			// WRITE - Checks that the file exists and that the program has permission to write to the file
			// EXECUTE - Checks that the file exists and that the program has permission to execute the file
			System.out.println("File can be read, executed, and written.");
		}
		
		catch(IOException e)
		{
			System.out.println("File cannot be used for this application");
			// If users change the file property to 'Read-Only', the file cannot be used, and the output message will be changed.
			// �б��������� �ٲٸ� ������ �Ұ����ϹǷ� ���Ұ����ϴٴ� �޼����� �ٲ�!!
		}
	}
}
