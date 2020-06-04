package CSIS2175.L_Chapter_3b;
//Date : 2020.05.26
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p14)
//Subject : File Input and Output - PathDemo3

import java.nio.file.*;
import static java.nio.file.AccessMode.*;	// 파일 엑세스 가능여부 체크!
import java.io.IOException;	// 입출력예외 - 에러감지용

public class PathDemo3 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\data.txt");
		System.out.println("Path is " + filePath.toString());	// 파일 경로 설정 후 경로 출력
		
		try
		{
			filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE, WRITE);
			// checkAccess method 내에 argument 종류에 따라 옵션이 달라짐
			// READ - Checks that the file exists and that the program has permission to read the file
			// WRITE - Checks that the file exists and that the program has permission to write to the file
			// EXECUTE - Checks that the file exists and that the program has permission to execute the file
			System.out.println("File can be read, executed, and written.");
		}
		
		catch(IOException e)
		{
			System.out.println("File cannot be used for this application");
			// If users change the file property to 'Read-Only', the file cannot be used, and the output message will be changed.
			// 읽기전용으로 바꾸면 접근이 불가능하므로 사용불가능하다는 메세지로 바뀜!!
		}
	}
}
