package Chapter_3;
//Date : 2020.05.18
//Name : Mark JunHyung Kim
//Chapter : #3 (p102~)
//Subject : Understanding Method Calls and Placement

public class calculateGross {

	public static void main(String[] args) {
		
		// the calculateGross method can use any argument that can be promoted to a double.
		// for example..
		
		calculateGross(10);
		calculateGross(28.5);
		calculateGross(7.5 * 5);
		// calculateGross(STANDARD_WORK_WEEK); = uses named constant that might be a double, float, long, int, short, or byte.		
		// calculateGross(myHours); = this call uses a variable that might be a double, float, long, int, short, or byte.
		// calculateGross(getGross()); = this call assumes that the getGross() method returns a double, float, long, int, short, or byte.
		
		System.out.println("\n\n");
		
		double hours = 25;
		double yourHoursWorked = 37.5;
		
		calculateGross(10);
		calculateGross(hours);
		calculateGross(yourHoursWorked);
		

	}
	
	// parameter 'hours' is just a 'placeholder'. it won't change any values in main() class.
	public static void calculateGross(double hours)	// the parameter 'hours' is a 'local variable'.!
	{
		final double STD_RATE = 13.75; // the 'final' makes STD_RATE constant!
		double gross;
		gross = hours * STD_RATE;
		System.out.println(hours + " hours at $" + STD_RATE + " per hour is $" + gross);		
	}
	
	// 페이지 125부터 볼것!!

}
