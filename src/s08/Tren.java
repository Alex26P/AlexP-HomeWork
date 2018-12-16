package s08;

import java.util.ArrayList;

public class Tren {

	private int id;
	private Locomotiva locomotiva;
	private ArrayList<Vagon> vagoane;
	// id + locomotiva + lista vagoane

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
		// ca sa pot adauga un vagon, trebuie sa am o viteza maxima >= 50
		// viteza maxima se calculeaza ca fiind viteza initiala - greutatea vagonului
		double viteza = vitezaMaxima() - vagon.getGreutate();
		// daca viteza este mai mare sau egala cu 50,
		// si daca vagonul este unul de pasageri,
		if (viteza >= 50) {
			if (vagon instanceof VagonPasageri) {
				// (ca sa stabilesc viteza: viteza-greutate vagon)
				// greutatea unui vagonpasageri este nr locuri*0,07))
				// deci viteza-nrpasagerix0.07
				if (viteza - ((VagonPasageri) vagon).getNrpasageri() * 0.07) {
					// nr pasageri nu e de tip vagon, asa ca ii face cast

					// deci daca se incadreaza, adauga vagonul
					this.vagoane.add(vagon);

				}
			} else {
				this.vagoane.add(vagon);
				// altfel adauga urmatorul

			}
		}
	}

	private double vitezaMaxima() {
		// din moment ce locomotiva are viteza, calculam viteza max a locomotivei
		double max = locomotiva.getVitezaMaxima();
		// for each loop
		for (Vagon v : vagoane) {
			max = max - v.getGreutate();
			// pentru fiecare vagon din lista, viteza maxima este
			// (viteza initiala - greutatea vagonului)

			// daca vagonul din lista este vagon de pasageri
			// greutatea unui vagon de pasageri este
			// (greutatea + (0.07*nr de locuri(pasageri))

			if (v instanceof VagonPasageri) {
				max = max - (0.07 * ((VagonPasageri) v).getNrpasageri());
			}
		}
		return max;
	}

	// returneaza locomotiva cu viteza max si vagoanele componente
	@Override
	public String toString() {
		return "Locomotiva: " + locomotiva.getId() + " , viteza maxima: " + vitezaMaxima() + "km/h." + "\n Vagoane: "
				+ this.vagoane.toString();
	}

}
