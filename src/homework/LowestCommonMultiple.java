package homework;

//Lowest Common Multiple: the smallest number that is a multiple of 2 or more numbers

public class LowestCommonMultiple {

	public static void main(String[] args) {

		int nr1 = 3;
		int nr2 = 5;

		System.out.println("The Lowest Common Multiple of " + nr1 + " and " + nr2 + " is: " + getLowComMlt(nr1, nr2));
	}

	private static int getLowComMlt(int nr1, int nr2) {

		for (int x = 2;; x++) {
			if (x % nr1 == 0 && x % nr2 == 0) {
				return x;
			}
		}
	}

}