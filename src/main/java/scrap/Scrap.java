package scrap;

public class Scrap {
	public static void main (String args[]) {
		if (args[0].compareToIgnoreCase("-lunch") == 0 ) {
			MealFunctions.getMeal("1");
		}
		else if (args[0].compareToIgnoreCase("-dinner") == 0 ) {
			MealFunctions.getMeal("3");
		}
		else if (args[0].compareToIgnoreCase("-salads") == 0 ) {
			MealFunctions.getMeal("5");
		}
		else if (args[0].compareToIgnoreCase("-desserts") == 0 ) {
			MealFunctions.getMeal("7");
		}
	}
}
