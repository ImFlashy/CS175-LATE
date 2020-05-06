public class Vehicle {

	double fuelEfficacy;
	double mpg;

	public Vehicle (double fuelEfficacy, double mpg) {
		this.fuelEfficacy = fuelEfficacy;
		this.mpg = mpg;
	}

	public double refills(double expectedDistance) {
		double totalDistance = fuelEfficacy * mpg;

		double numberOfRefills = expectedDistance / totalDistance;

		return  Math.round(1 + numberOfRefills);

	}
}