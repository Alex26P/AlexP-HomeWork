package session07;

public class Clasament {
	public static void main(String[] args) {

		Student student1;// declarare
		student1 = new Student("Gheorge", 8, 10);// initializare
		Student student2 = new Student("Vasile", 7, 8);
		Student student3 = new Student("Ion", 7, 9);

		/*
		 * student1.nume = "Gheorge"; student1.nota1 = 8; student1.nota2 = 10;
		 */

		// array de Student, care contine lista de studenti
		Student[] studenti = { student1, student2, student3 };

		// temporary storage - where I can put things when I want to swap 2 variables
		Student x;

		// bubble sort - algoritm de sortare/ sorteaza studenti
		for (int i = 0; i < studenti.length; i++) {// i incepe la pozitia 0 (student1)
			for (int j = 1; j < (studenti.length - i); j++) {// j incepe la pozitia 1 (student2)
				// student2<student1 (-i = cel de la pozitia de dinainte)
				if (studenti[j - 1].getMedia() > studenti[j].getMedia()) {
					// -1 = ultima pozitie - daca cel de la ultima pozitie e mai mare

					// algoritm de interschimbare/ swap elements
					x = studenti[j - 1];// muta in x cel de la ultima pozitie(cel mai mare)
					studenti[j - 1] = studenti[j];// in locul lui muta cel de dinainte
					studenti[j] = x;

					// [9,7,8]
					// [7,9,8]
					// [7,8,9]
				}
			}
		}

		for (int i = 0; i < studenti.length; i++) {
			// "\n" - afiseaza pe urmatoarea linie
			System.out.println("Nume: " + studenti[i].getNume() + "\n" + "Media: " + studenti[i].getMedia());
			// afiseaza numele si media pentru fiecare student in ordinea mediilor
		}
	}
}
