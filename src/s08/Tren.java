package s08;

import java.util.ArrayList;

public class Tren {

	private int id;
	private Locomotiva locomotiva;
	private ArrayList<Vagon> vagoane;
	// id + locomotiva + lista vagoane
	// nu stiu cum sa fac altfel decat cu araylist.
	// arraylist-ul l-am gasit pe internet

	public Tren(int id, Locomotiva locomotiva) {
		this.id = id;
		this.locomotiva = locomotiva;
		this.vagoane = new ArrayList<Vagon>();
		// nu merge bagat direct ca parametru
	}

	public Locomotiva getLocomotiva() {
		return locomotiva;
	}

	public void setLocomotiva(Locomotiva locomotiva) {
		this.locomotiva = locomotiva;
	}

	public ArrayList<Vagon> getVagoane() {
		return vagoane;
	}

	public int getId() {
		return id;
	}

	public void adaugaVagon(Vagon vagon) {
		// TO DO!!
		// 1. vitezamaxima (vitezamaxima - greutateavagonului)
		// pentru fiecare tona viteza scade cu 1km/h
		// 2. daca viteza este mai mare sau egala cu 50km/h
		// (daca e mai mica de 50, nu se mai permite adaugarea)
		// si daca vagonul este vagonpasageri
		// (ca sa stabilesc viteza: viteza-greutate vagon)
		// daca (viteza - greutatea unui vagonpasageri(care este nr locuri*0,07))
		// este mai mare sau egala cu 50km/h, adauga vagon
		// daca se incadreaza in cerinte, afiseaza-l

		// altfel, adauga-l pe asta + urmatorul (+altele daca mai trebuie)
		// afiseaza vagoanele adaugate
	}

	// dupa ce am adaugat, afisam viteza maxima
	private double vitezaMaxima() {
		// din moment ce locomotiva are viteza, calculam viteza max a locomotivei
		double max = locomotiva.getVitezaMaxima();
		// TO DO!!
		// pentru lista de vagoane,viteza maxima este viteza initiala-greutatea
		// vagonului
		// daca vagonul este unul de pasageri, vitezamax se calculeaza:
		// viteza initiala-greutate(care este nr locuri*0,07)
		return max;

	}

}
