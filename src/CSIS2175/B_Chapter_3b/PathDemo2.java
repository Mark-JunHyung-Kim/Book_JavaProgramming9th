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
		
		System.out.print("Enter a file name >> ");		// sample : data.txt (���� ������Ʈ �����ȿ� ������ �־�߸� �ϴµ�)
		name = keyboard.nextLine();			
		
		
		Path inputPath = Paths.get(name);	// �ڡ� �Է¹��� name�� ��θ� inputPath�� ����.		
		System.out.println("The path is " + inputPath.toString());
		// �ٵ� �̷��� �ϸ� path�� ������ element�� ǥ�õ� (�� ���ϸ� ǥ��)
		
		Path fullPath = inputPath.toAbsolutePath();		// �ڡ� inputPath�� ������ (full-path)�� ����.		
		System.out.println("Full path is " + fullPath.toString());	
		// �̷��� �ϸ� ��� ��ΰ� �� ǥ�õ�.

	}

}
