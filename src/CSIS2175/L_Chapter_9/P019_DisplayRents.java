package CSIS2175.L_Chapter_9;
//Date : 2020.06.22
//Name : Mark JunHyung Kim
//Chapter : Lecture#07 = Chapter#9
//Subject : P019 - Display Rents

public class P019_DisplayRents 
{

	public static void main(String[] args) 
	{
		int[][] rents = { {400, 450, 510},				// Floor 0 rents
				  		{500, 560, 630},				// Floor 1 rents
				  		{625, 676, 740},				// Floor 2 rents
				  		{1000, 1250, 1600} };			// Floor 3 rents
		
		int floor;
		int bdrms;
		for(floor = 0; floor < rents.length; ++ floor)
			for(bdrms = 0; bdrms < rents[floor].length; ++bdrms)
				System.out.println("Floor " + floor + " Bedrooms " + bdrms + " Rent is $" + rents[floor][bdrms]);
	}

}
