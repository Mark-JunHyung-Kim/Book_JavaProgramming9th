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
		// 파일명 (경로+파일명) 이나 경로를 지정가능
		
		
		try
		{
			Files.delete(filePath);		// permission이 있는 경우, 파일 삭제가 가능함.
			System.out.println("Files or directory is deleted");
		}
		catch (NoSuchFileException e)
		{
			System.out.println("No such file or directory");	// 이미 삭제되서 없는경우, 			
		}
		catch (DirectoryNotEmptyException e)
		{
			System.out.println("Directory is not empty");	// 폴더 안에 파일이 있는경우 (삭제불가!)
		}
		catch (SecurityException e)
		{
			System.out.println("No permission to delete");	// 권한이 없는경우
		}
		catch (IOException e)
		{
			System.out.println("IO exception");	// 이것도 권한이 없는경우긴 함.
		}
	}

}
