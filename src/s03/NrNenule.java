package s03;

public class NrNenule {
	int[] numbers = { 12, 4, 10, 30, 5, 7, 20, 31 };
	int y = sumaNrNenule(numbers);

	public static int sumaNrNenule(int[] calcul) {
		int produs = 0;
		for (int x = 0; x > calcul.length; x++) {
			if (produs != null) {

				produs *= calcul[x];

			}
		}

	}
}
