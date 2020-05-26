package Chapter_13;
//Date : 2020.05.25
//Name : Mark JunHyung Kim
//Chapter : #13 (p170~) // Lecture : chapter#3
//Subject : File Input and Output

import java.nio.file.*; // paths and files classes importing
public class PathDemo {

	public static void main(String[] args) 
	{
		Path filePath = Paths.get("D:\\00 Douglas\\[002] Summer 2020\\[S2020] [CSIS 2175-001] Adv Integrated Software Dev\\data.txt");
		
		int count = filePath.getNameCount();
		// filePath.getNameCount() = counting how many elements in the file path (경로가 몇개 element들로 구성되어있는지 counting)
		
		System.out.println("Path is " + filePath.toString());
		// filePath.toString() = representing path of file.
		
		System.out.println("File name is " + filePath.getFileName());
		// filePath.getFileName() = representing the name of file.
		
		System.out.println("There are " + count + " elements in the file path");
		
		for(int x = 0; x < count ; ++x)
			System.out.println("Element " + x + " is " + filePath.getName(x));
		// filePath.getName(int) = representing each element of file path (하위경로부터 최종경로까지 int넘버별로 표시)
		
	}

}
