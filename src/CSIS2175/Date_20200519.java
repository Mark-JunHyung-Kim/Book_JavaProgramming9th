package CSIS2175;

import java.nio.file.*;
//import java.nio.file.FileSystem; 이것들 대신 * 위에껄로 써도 됨.
//import java.nio.file.FileSystems;
//import java.nio.file.Path; 
//import java.nio.file.Paths;



public class Date_20200519 {

	public static void main(String[] args) {
		
		float abc = 123.456789f;		
		String str = String.format("%.2f", abc);
		
		System.out.println(str);
		
		//PrefixPostfix
		
		int myNumber, answer;
		myNumber = 17;
		System.out.println("Before incrementing, mynNumber is " + myNumber);		
		answer = ++myNumber;
		System.out.println("After prefix incrementing, mynNumber is " + myNumber);
		System.out.println(" and answer is " + answer);
		
		System.out.println("%n%n");
		
		myNumber = 17;
		System.out.println("Before incrementing, mynNumber is " + myNumber);		
		answer = myNumber++;
		System.out.println("After postfix incrementing, mynNumber is " + myNumber);
		System.out.println(" and answer is " + answer);
		
		
		// Loop conditions
		
		int val = 0;
		int h = 0;
		for(val = 1, h = 0; val < 11; ++val)	// 두개도 가능은 함, 하지만 추천하지않음.
			System.out.print(val);
		
		// Book Page#302
		
		// To make more detailed or flexible conditions, 'second' or 'third' condition can be inside of another con. 
		for(int customer = 0; customer < 10; customer++) {
			for(int color = 0; color < 10; color++) {
				System.out.println(customer);
			}
				
		}
		
		// go to chapter 3.b (Input & Output)
		
		// Creating a Path. 
		FileSystem fs = FileSystems.getDefault(); // second thing has 's'.
		
		//Path path = fs.getPath ("C:\\Java\\Chapter.13\\Data.txt"); 이렇게 쓰거나 아래처럼.
		Path filePath = 
				Paths.get("E:\\data.txt");
				int count = filePath.getNameCount();
				System.out.println("Path is " + filePath.toString());	// 경로 출력
				System.out.println("File Name is " + filePath.getFileName());	// 파일명 출력
		
		// page#12 (3.b)
		// The pathdemo.2
		// The pathdemo.3 17페이지 까지? 
				
				
				
				
	

	}

}
