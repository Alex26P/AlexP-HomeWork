package s06;

public class Tema {
	
public static void main(String[] args) {
	
	Tema division = new Tema();
	division.getSomething(3,5);
	
}

	private int getSomething (int a, int b) {
		if (b==0) {
			return -1;
			
		}else {
			
	return a/b;
	}
}
}
