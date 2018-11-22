package s03;

public class ReturneazaNumarul {

	public static void main(String[] args) {

		int[] numbers;
		afisareNr();
		System.out.println("Numarul format este: " + Array.toString(numbers));// teoretic Array.toString afiseaza o
																				// reprezentare a numerelor, dar nu imi
																				// dau seama ce sa fac sau ce am
																				// gresit..
	}

	private static int[] afisareNr() {
		int numbers[] = { 1, 9, 9, 4 };
		return numbers;

	}

}
