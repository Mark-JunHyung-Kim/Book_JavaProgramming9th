package CSIS2175.L_Chapter_3b;
//Date : 2020.05.26
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p10-11)
//Subject : File Input and Output - PathDemo1

import java.nio.file.*;
public class PathDemo1 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:\\Java\\data.txt");
		
		int count = filePath.getNameCount();	// count = 2? 드라이브명 제외, 파일명 -> 경로 까지만.
		System.out.println("Count = " + count);
		
		// filePath.toString() = 파일 경로명 출력.
		System.out.println("Path is " + filePath.toString());
		
		// filePath.getFileName() = 파일명'만' 출력
		System.out.println("File name is " + filePath.getFileName());
		
		System.out.println("There are " + count + " elements in the file path");
		
		for (int x = 0; x < count; ++x)
			// 파일 경로(path)를 count (단계)별로 출력.
			System.out.println("Element " + x + " is " + filePath.getName(x));
	}

}
