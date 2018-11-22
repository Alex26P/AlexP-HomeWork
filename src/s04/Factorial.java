package s04;

//Factorial (n!): multiplication of all integers -smaller than- or -equal to- a number
//5! = 5*4*3*2*1 (120)

public class Factorial {

	public static void main(String[] args) {

		System.out.println("The factorial of 5 is " + isFactorial(5)); // the method (the chosen number)
	}

	private static int isFactorial(int n) {

		int multiplication = 1;

		for (int x = 2; x <= n; x++) { // x=2 and add 1 each time, until it gets to 5 (x<=5)

			multiplication *= x; // the short version of (multiplication = multiplication * x;)
			// 1*2*3*4*5
		}
		return multiplication;
	}
}
