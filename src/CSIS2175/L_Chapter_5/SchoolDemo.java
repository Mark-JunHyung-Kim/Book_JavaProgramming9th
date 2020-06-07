package CSIS2175.L_Chapter_5;
//Date : 2020.06.06
//Name : Mark JunHyung Kim
//Chapter : Lecture : Chapter#5 (~46)
//Subject : More Object Concepts

public class SchoolDemo 
{

	public static void main(String[] args) 
	{
		School mySchool = new School("Audubon Elementary", "3500 Hoyne", 60618, 350);
		// 클래스 School통해 만들어진 mySchool이라는 오브젝트에, School Constructor를 해당 파라메터들을 입력값으로 해서 콜을 하여 해당 값들을 가지게 함.
		
		mySchool.display();
		// 이후 mySchool 오브젝트의 클래스 내에 있는 display메서드를 콜해서 출력.
		// display도 잘 보면, School 클래스의 display메서드 콜을 하고, 그 School 클래스의 display메서드 내에서 NameAndAddress 클래스의 display 콜이 이중으로 (nested하게) 콜되는걸 확인할 수 있음.
	

	}

}
