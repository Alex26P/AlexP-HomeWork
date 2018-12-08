package session07;

public class Student {
	// nu uita de specificatorii de acces !!! (private/public)
	// variabilele
	String nume;
	int nota1;
	int nota2;

	// constructorul
	Student(String nume, int nota1, int nota2) {
		this.nume = nume;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	// getter - sa returneze numele automat, fara a trebui sa il mai scriu
	String getName() {
		return nume;
	}

	// metoda
	// metoda asta in afara de faptu ca nu are specificator de acces public e foarte ok, imi demonstreaza ca ai inteles ceva
	// din OOP. E exact cum ar trebui sa fie
	double getMedia() {
		return (nota1 + nota2) / 2;
	}

}
