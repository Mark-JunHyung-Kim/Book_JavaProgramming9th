package Chapter_4;
//Date : 2020.05.23
//Name : Mark JunHyung Kim
//Chapter : #4 (p175~)
//Subject : More Object Concept

public class TestEmployeeMethods 
{

	public static void main(String[] args) 
	{
		Employee aWorker = new Employee();
		aWorker.setValues();
		aWorker.methodThatUsesInstanceAttributes();
		aWorker.methodThatUsesLocalVariables();
	}

}
