package s08;

public class Vagon {

	private int id;
	private double greutate;

	public Vagon(int id, double greutate) {
		this.id = id;
		this.greutate = greutate;
	}

	public int getId() {
		return this.id;
	}

	public double getGreutate() {
		return this.greutate;
	}

	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}

}
