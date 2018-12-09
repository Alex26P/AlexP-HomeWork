package session07;

public class Circle implements Shape {// implementeaza interfata
	private int raza;

	// constructorul
	public Circle(int r) {
		this.raza = r;// ia valoarea lui r din main
	}

	@Override
	public double getArea() {
		return Math.PI * this.raza * this.raza;
		// arr= PIR2(pixrazaxraza(raza la a doua)
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * raza;
		// per = 2PIR(2xpixraza)
	}

}
