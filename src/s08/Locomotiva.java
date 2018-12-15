package s08;

public class Locomotiva {
	private int id;
	private double vitezamax;

	public Locomotiva(int id, double vitezamax) {
		this.id = id;
		this.vitezamax = vitezamax;
	}

	public double getVitezaMaxima() {
		return this.vitezamax;
	}

	public int getId() {
		return id;
	}

}
