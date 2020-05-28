package CSIS2175.B_Chapter_3b;
//Date : 2020.05.27
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p19)
//Subject : File Input and Output - PathDemo5

import java.nio.file.*;		// 이걸 추가해도 attribute 클래스는 따로 또 추가해줘야함.
import java.nio.file.attribute.*;		// 파일 상세정보 확인할때 쓰는 클래스!!
import java.io.IOException;	// nio 아님!!

public class PathDemo5 {

	public static void main(String[] args) {
		
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\example\\data.txt");
		//Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\example");
		// 파일명 (경로+파일명) 이나 경로를 지정가능
		
		try
		{
			BasicFileAttributes attr = 
					Files.readAttributes(filePath,  BasicFileAttributes.class);
			// 기본파일정보 객체를 만들어줌. 요소에 대해 나중에 한번 다시 자세히 볼것.
			
			System.out.println("Creation time " + attr.creationTime());		// 파일 생성 시간(일자)
			System.out.println("Last modified time " + attr.lastModifiedTime());	// 마지막 수정 시간(일자)
			System.out.println("Size " + attr.size());	// 파일 사이즈 (바이트단위)
		}
		catch (IOException e)
		{
			System.out.println("IO Exception");
		}

	}

}
