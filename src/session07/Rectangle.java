
package session07;

public class Rectangle implements Shape {// implementeaza interfata

	int lungime;
	int latime;

	// constructorul
	public Rectangle(int lg, int lt) {
		this.lungime = lg;// ia valoarea lui lg din main
		this.latime = lt;// ia valoarea lui lt din main
	}

	@Override
	public double getArea() {
		return this.lungime * this.latime;
		// adica 7x4
	}

	@Override
	public double getPerimeter() {
		return this.lungime * 2 + this.latime * 2;
		// adica 7x2 + 4x2
	}

}
