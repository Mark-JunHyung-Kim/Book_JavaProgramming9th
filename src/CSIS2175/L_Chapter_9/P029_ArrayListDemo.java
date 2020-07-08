package CSIS2175.L_Chapter_9;
//Date : 2020.06.24
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P029 - Array List Demo


import java.util.ArrayList;
public class P029_ArrayListDemo 
{

	public static void main(String[] args) 				// 책 페이지 448
	{
		ArrayList<String> names = new ArrayList<String>();	// use angle bracket.
		
		names.add("Abigail");						// ArrayList.add("값"); 배열리스트에 값 추가
		display(names);
		
		names.add("Brian");
		display(names);
		
		names.add("Zachary");
		display(names);
		
		names.add(2, "Christy");					// 포지션을 정해줘서 넣음. (포지션 2지만, 실제로 0, 1, 2이므로 3번째에 들어감)
		display(names);
		
		names.remove(1);							// ArrayList의 position 1값 제거 (Brian이 제거됨)
		display(names);
		
		names.set(0, "Annette");					// 이거는 기존에 있던 position 0에 새로운 값을 넣어(set)주는 것.
		display(names);
		

	}
	public static void display(ArrayList<String> names)
	{
		System.out.println("\n The size of the list is " + names.size());	// names ArrayList의 크기값 확인
		for(int x = 0; x < names.size(); ++x)
			System.out.println("position " + x + " Name : " + names.get(x));	// 0부터 크기값까지 저장된 값들 출력
	}

}
