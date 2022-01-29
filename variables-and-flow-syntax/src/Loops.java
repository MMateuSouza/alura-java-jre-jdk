
public class Loops {

	public static void main(String[] args) {
		int min = 1, max = 10;
		for (int multiplier = min; multiplier <= max; multiplier++) {
			System.out.println("Tabuada do " + multiplier);
			for (int counter = min; counter <= max; counter++) {
				System.out.println(multiplier + " X " + counter + " = " + (multiplier * counter));
			}
			System.out.println();
		}
	}

}
