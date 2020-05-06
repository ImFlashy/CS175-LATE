import java.util.Scanner; //import Scanner

public class taxCalcClass {

	public static void main(String[] args) {

		final double BASETAXRATE = 0.10; // for single filing 
		final double INCTAXRATE = 0.25; // for joint filing 
		final double SINGLEFILINGMIN = 32000.00; //for single filing 
		final double JOINTFILINGMIN = 64000.00; //for joint filing 
		double totalTaxes = 0.00;

		Scanner in = new Scanner (System.in); //must open scanner

		System.out.print("Enter Filing Status (S)ingle or (J)oint: ");
		String filerType = in.next();

		if (filerType.equals("S")) {
			System.out.print("Enter Total Income: ");

			if (in.hasNextDouble()) {
				double income = in.nextDouble();
				if (income <= SINGLEFILINGMIN) {
					totalTaxes = income * BASETAXRATE;
				} 
				else {
					double baseTax = SINGLEFILINGMIN *  BASETAXRATE;
					totalTaxes = baseTax + (income - SINGLEFILINGMIN) * INCTAXRATE;	
				}

				// no need to pay tax if total taxes is less $5.00
				if (totalTaxes >= 5.00) {
					System.out.println ("Total Taxes Due: " + String.format("%.2f", + totalTaxes));	
				} else {
					System.out.println ("No Taxes Due this year!");
				}

			} 
			else {
				System.out.println ("Income should be a number");
			}

		}
		else if  (filerType.equals("J")) {
			System.out.print("Enter Total Income: ");

			if (in.hasNextDouble()) {
				double income = in.nextDouble();
				if (income <= JOINTFILINGMIN) {
					totalTaxes = income * INCTAXRATE;
				} 
				else {
					double baseTax = JOINTFILINGMIN *  INCTAXRATE;
					totalTaxes = baseTax + (income - JOINTFILINGMIN) * INCTAXRATE;			
				}
			} 
			else {
				System.out.println ("You need to enter S or J");
			}
			System.out.println ("Total Taxes Due: " + String.format("%.2f", + totalTaxes));
		}
		in.close(); // must close Scanner 
	}
}