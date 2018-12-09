package session07;

public class Square implements Shape {// implementeaza interfata

	private int latura;

	// constructorul
	public Square(int lat) {
		this.latura = lat;// latura ia valoarea lui lat(din main)
	}

	@Override
	public double getArea() {
		return this.latura * this.latura;
		// adica 5x5
	}

	@Override
	public double getPerimeter() {
		return this.latura * 4;
		// adica 5x4 laturi
	}

}
