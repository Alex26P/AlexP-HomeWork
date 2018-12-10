package session07;

public class Student {
	// variabilele
	private String nume;
	private int nota1;
	private int nota2;

	// constructorul
	Student(String nume, int nota1, int nota2) {
		this.nume = nume;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	// getter - sa returneze numele automat, fara a trebui sa il mai scriu
	public String getNume() {
		return nume;
	}

	// metoda
	public double getMedia() {
		return (nota1 + nota2) / 2.0;// 15/2 = 7____15/2.0=7.5
	}

}
