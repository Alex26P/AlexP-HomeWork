package s08;

import java.util.ArrayList;

public class Depou {
	private static int id;
	// nu merge sa il scriu in main..

	public static void main(String[] args) {

		// vagoane marfa (id + greutate)
		Vagon vagonM1 = new Vagon(1, 50);
		Vagon vagonM2 = new Vagon(2, 60);

		// vagoane pasageri(id + greutate + nr pasageri)
		VagonPasageri vagonP1 = new VagonPasageri(1, 50, 50);
		VagonPasageri vagonP2 = new VagonPasageri(2, 50, 100);
		VagonPasageri vagonP3 = new VagonPasageri(3, 50, 150);
		VagonPasageri vagonP4 = new VagonPasageri(4, 100, 200);
		VagonPasageri vagonP5 = new VagonPasageri(5, 100, 250);

		// locomotive (id + nr km/h)
		Locomotiva locomotiva1 = new Locomotiva(1, 200);
		Locomotiva locomotiva2 = new Locomotiva(2, 500);

		// in depou vreau sa adaug o locomotiva care merge cu 156 km/h (locomotiva1)
		// adaug un vagonmarfa(vagonm1)
		Tren tren1 = new Tren(156, locomotiva1);
		tren1.adaugaVagon(vagonM1);
		System.out.println(tren1.getId());

		// o lista cu vagoanele pe care le am disponibile
		ArrayList<VagonPasageri> vagoaneDisponibile = new ArrayList<VagonPasageri>();
		vagoaneDisponibile.add(vagonP1);
		vagoaneDisponibile.add(vagonP2);
		vagoaneDisponibile.add(vagonP3);

		// vreau sa creez un tren: greutate 152, nr pasageri 80
		// sa fie alcatuit din locomotiva 2 si
		// vagoane necesare pentru a incapea nr de pasageri (din vagoanele disponibile)

		Tren trenGenerat = genereazaTren(152, 80, vagoaneDisponibile, locomotiva2);
		System.out.println(trenGenerat);
		// nu stiu cum sa ii generez id-ul...
	}

	public static Tren genereazaTren(int nrPasageri, double greutate) {

		// varianta 1: ia vagonul care se potriveste perfect
		// pentru fiecare vagon de pasageri din cele disponibile
		// daca greutatea vagonului este egala cu greutatea ceruta,
		// si nr de pasageri este egal cu cel cerut, adauga vagonul acela la tren
		for (VagonPasageri v : vagoaneDisponibile) {
			if (greutate == v.getGreutate() && nrPasageri == v.getNrpasageri()) {
				tren.adaugaVagon(v);
				return tren;
			}
		}

		// varianta 2: ia vagonul care e mai mare
		// pentru fiecare vagon de pasageri din cele disponibile,
		// daca greutatea ceruta este mai mica sau egala
		// si nr de pasageri ceruti este mai mic sau egal, adauga vagonul
		for (VagonPasageri v : vagoaneDisponibile) {
			if (greutate <= v.getGreutate() && nrPasageri <= v.getNrpasageri()) {
				tren.adaugaVagon(v);
				return tren;
			}
		}

		// varianta 3: ia mai multe vagoane
		//pentru fiecare vagon de pasageri din cele disponibile,
		//
		for (VagonPasageri v : vagoaneDisponibile) {
		//?????
				return tren;
			}
		}return null;
}

}
