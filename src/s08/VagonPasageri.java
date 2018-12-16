package s08;

public class VagonPasageri extends Vagon {
	private int nrpasageri;

	public VagonPasageri(int id, double greutateMaxima, int nrpasageri) {
		// id si greutate de la clasa vagon + nrpasageri
		super(id, greutateMaxima);
		this.nrpasageri = nrpasageri;
	}

	public int getNrpasageri() {
		return nrpasageri;
	}

	public void setNrpasageri(int nrpasageri) {
		this.nrpasageri = nrpasageri;
	}

	@Override
	public String toString() {
		return "\n Vagon: " + this.getId() + ", greutate: " + this.getGreutate() + " nr pasageri: " + nrpasageri;
	}

}
