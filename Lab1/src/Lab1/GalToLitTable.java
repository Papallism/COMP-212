package Lab1;
// This program displays a conversion table of gallons to liters.
public class GalToLitTable {

	public static void main(String[] args) {
		int counter = 0;
		double gallons, liters;
		for(gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters.");
			counter++;
			if(counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

}
