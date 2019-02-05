package project.calories.model;

import java.io.Serializable;
import java.util.HashMap;

public class Aliment implements Serializable {

	private static final long serialVersionUID = 1L;
	public String nume;
	public HashMap<UM, Integer> caloriiPerUnitate = new HashMap<UM, Integer>();

	public Aliment(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public boolean hasName(String name) {
		return this.nume.equals(name);
	}

	@Override
	public String toString() {
		return nume;
	}

	public void addUM(UM um, int calorii) {
		this.caloriiPerUnitate.put(um, calorii);
	}

	public int getCaloriesPerUM(UM unitate) {
		return this.caloriiPerUnitate.get(unitate);
	}
}
