package session07;

public class Clasament {
	public static void main(String[] args) {

		Student student1 = new Student("Gheorge", 8, 10);
		Student student2 = new Student("Vasile", 7, 8);
		Student student3 = new Student("Ion", 7, 9);

		/*
		 * student1.nume = "Gheorge"; student1.nota1 = 8; student1.nota2 = 10;
		 */
		double mediaStudent1 = student1.getMedia();

		/*
		 * student2.nume = "Vasile"; student2.nota1 = 7; student2.nota2 = 8;
		 */

		double mediaStudent2 = student2.getMedia();

		/*
		 * student3.nume = "Ion"; student3.nota1 = 7; student3.nota2 = 9;
		 */

		double mediaStudent3 = student3.getMedia();

		// afisare clasament in ordinea mediilor
		// ????
		// sa folosesc oare o instructiune??
		// inca nu imi dau seama....
		// se poate si cu o instructiune dar inca nu v-am invatat.
		// ce vreau eu sa va cere sa-i puneti intr-un array de Student si pe array sa implementati un algoritm de sortare
		// (ex: bubble sort (vezi pe net))
	}

}
