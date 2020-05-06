public class VehicleTester {

	public static void main (String[] args) {
		Vehicle SUV = new Vehicle(40.0, 20.0);
		System.out.println("Number of refills for a SUV: " + SUV.refills(1000));
		
		Vehicle Sedan = new Vehicle(20.5, 10.25);
		System.out.println("Number of refills for a Sedan: " + Sedan.refills(1000));
		
		Vehicle Truck = new Vehicle (30.0, 15.0);
		System.out.println("Number of refills for a Truck: " + Truck.refills(1000));
	}

}