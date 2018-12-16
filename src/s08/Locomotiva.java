package s08;

public class Locomotiva {
	private int id;
	private double vitezaMax;

	public Locomotiva(int id, double vitezaMax) {
		this.id = id;
		this.vitezaMax = vitezaMax;
	}

	public double getVitezaMaxima() {
		return this.vitezaMax;
	}

	public int getId() {
		return id;
	}

}
