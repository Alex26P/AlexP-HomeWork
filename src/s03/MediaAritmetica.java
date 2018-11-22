package s03;

public class MediaAritmetica {

	public static void main(String[] args) {

		/*
		 * int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		 * 
		 * int x; int suma = 0; int calcul;
		 * 
		 * for (x = 0; x < numbers.length; x++) {
		 * 
		 * suma += numbers[x]; }
		 * 
		 * calcul = suma / numbers.length;
		 */
		// System.out.println("Media aritmetica este: " + calcul);

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		mediaAritmetica(numbers);

	}

	public static int[] mediaAritmetica(int[] calcul) {

		int suma = 0;
		for (int x = 0; x < calcul.length; x++) {
			suma += calcul[x];// suma=suma+calcul
		}

		int media = suma / calcul.length;
		System.out.println("Media aritmetica este: " + media);
		int[] results = { suma, media };
		return results;
	}

}
//