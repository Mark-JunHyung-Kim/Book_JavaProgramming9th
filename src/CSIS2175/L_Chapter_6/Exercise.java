package CSIS2175.L_Chapter_6;
//Date : 2020.06.09
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#6 (16)
//Subject : Arrays

public class Exercise {			// lecture page 16

	public static void main(String[] args) {
		int[] nineIntegers = {0, 1, 2, 3, 4, 5, 6, 7, 8};
		
		int x = 0;	
		
		
		for(x = 0; x < nineIntegers.length; x ++) 
			System.out.print(nineIntegers[x]);
		
		System.out.println();		
		
		
		
		for(x = nineIntegers.length - 1; x >= 0; x --) 	// ★★★ 주의!!! 배열 크기를 기준점으로 쓰게되면, 꼭 -1을 해줘야함!!
			System.out.print(nineIntegers[x]);			// 배열은 카운트를 0부터 세기때문에, 배열 크기를 그대로 넣으면 오류남!

	}

}
