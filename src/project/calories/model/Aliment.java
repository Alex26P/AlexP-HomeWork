package project.calories.model;

import java.io.Serializable;
import java.util.HashMap;

public class Aliment implements Serializable {

	private static final long serialVersionUID = 1L;
	public String nume;
	public HashMap<String, Integer> caloriiPerUnitate;

	public Aliment(String nume, HashMap<String, Integer> caloriiPerUnitate) {
		super();
		this.nume = nume;
		this.caloriiPerUnitate = caloriiPerUnitate;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public HashMap<String, Integer> getCaloriiPerUnitate() {
		return caloriiPerUnitate;
	}

	public void setCaloriiPerUnitate(HashMap<String, Integer> caloriiPerUnitate) {
		this.caloriiPerUnitate = caloriiPerUnitate;
	}

	public boolean hasName(String name) {
		return this.nume.equals(name);
	}

	@Override
	public String toString() {
		return nume;
	}
}
