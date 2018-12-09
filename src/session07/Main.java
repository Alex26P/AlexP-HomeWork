package session07;

public class Main {// clasa principala cu metoda main

	public static void main(String[] args) {
		// crearea obiectelor de tip Shape
		Shape patrat = new Square(5);
		Shape dreptunghi = new Rectangle(7, 4);
		Shape cerc = new Circle(8);

		// array de shape-uri
		Shape array[] = { patrat, dreptunghi, cerc };// contine cate o instanta din fiecare clasa

		for (int i = 0; i < array.length; i++) {
			System.out.println("Perimetru = " + array[i].getPerimeter() + " Arie = " + array[i].getArea());
			// pentru fiecare se apeleaza getPerimeter() si getArea()
			// pentru cel de la pozitia 0,
			// afiseaza perimetru si arie, treci la urmatoarea pozitie, afiseaza si acolo
			// s.a.m.d
		}

	}

}
