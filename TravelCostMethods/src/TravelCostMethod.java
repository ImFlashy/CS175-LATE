import java.util.Scanner; 

public class TravelCostMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 

		double fuel_Efficacy_SUV = 20; //given 
		double cost_Per_Gallon_SUV = 2.90; //given 

		double fuel_Efficacy_Sedan = 30; //given
		double cost_Per_Gallon_Sedan= 2.50; //given 

		double cost_of_Travel = 0.0; //output for methods

		System.out.print("Will you be driving a (Sedan) or (SUV)? ");
		String mode_of_Travel = in.next();

		switch (mode_of_Travel) {
		case "SUV":
			cost_of_Travel = compute_Travel_Cost (fuel_Efficacy_SUV, cost_Per_Gallon_SUV );	
			System.out.println ("Anticipated cost of travel = $" + String.format("%.2f",cost_of_Travel));
			break;
		case "Sedan":
			cost_of_Travel = compute_Travel_Cost (fuel_Efficacy_Sedan, cost_Per_Gallon_Sedan );	
			System.out.println ("Anticipated cost of travel = $" + String.format("%.2f",cost_of_Travel));
			break;

		default:
			System.out.println("Incorrect Input. Please Reset and Try again.");
		}
		in.close();
	}

	static double compute_Travel_Cost (double fuel_Efficacy, double cost_Per_Gallon) {
		Scanner in = new Scanner (System.in);
		double travel_Cost = 0.0;
		
		System.out.print ("Enter anticipated Distance that will be traveled: ");
		if (in.hasNextDouble()) {
			double anticipated_Distance = in.nextDouble();
			 travel_Cost = (anticipated_Distance /fuel_Efficacy) * cost_Per_Gallon;
		} 
		else {
			System.out.println ("Invalid input");
		}
			in.close();
		return travel_Cost;

	}
}