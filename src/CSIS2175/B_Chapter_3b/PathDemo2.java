package CSIS2175.B_Chapter_3b;
//Date : 2020.05.26
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#3b (p12)
//Subject : File Input and Output - PathDemo2

import java.util.Scanner;
import java.nio.file.*;

public class PathDemo2 {

	public static void main(String[] args) {
		
		String name;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a file name >> ");		// sample : data.txt (현재 프로젝트 폴더안에 파일이 있어야만 하는듯)
		name = keyboard.nextLine();			
		
		
		Path inputPath = Paths.get(name);	// ★★ 입력받은 name의 경로를 inputPath에 저장.		
		System.out.println("The path is " + inputPath.toString());
		// 근데 이렇게 하면 path의 마지막 element만 표시됨 (즉 파일명만 표시)
		
		Path fullPath = inputPath.toAbsolutePath();		// ★★ inputPath의 절대경로 (full-path)를 저장.		
		System.out.println("Full path is " + fullPath.toString());	
		// 이렇게 하면 모든 경로가 다 표시됨.

	}

}
