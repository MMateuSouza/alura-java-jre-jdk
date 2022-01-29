
public class Break {

	public static void main(String[] args) {
		int min = 1, max = 10;
		for (int line = min; line <= max; line++) {
			for (int column = min; column <= max; column++) {
				if (column > line) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
