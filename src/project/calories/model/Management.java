package project.calories.model;

import java.io.Serializable;

public class Management implements Serializable {

	private static final long serialVersionUID = 1L;
	String nume;
	String unitateDeMasura;
	int nrCalorii;

	public Management(String nume, String unitateDeMasura, int nrCalorii) {
		super();
		this.nume = nume;
		this.unitateDeMasura = unitateDeMasura;
		this.nrCalorii = nrCalorii;
	}

	public void edit(String nume2, String unitateDeMasura2, int nrCalorii2) {
		nume = nume2;
		unitateDeMasura = unitateDeMasura2;
		nrCalorii = nrCalorii2;
	}
//
//	public String getNume() {
//		return nume;
//	}
//
//	public void setNume(String nume) {
//		this.nume = nume;
//	}
//
//	public String getUnitateDeMasura() {
//		return unitateDeMasura;
//	}
//
//	public void setUnitateDeMasura(String unitateDeMasura) {
//		this.unitateDeMasura = unitateDeMasura;
//	}
//
//	public int getNrCalorii() {
//		return nrCalorii;
//	}
//
//	public void setNrCalorii(int nrCalorii) {
//		this.nrCalorii = nrCalorii;
//	}

	@Override
	public String toString() {
		return "Management [nume=" + nume + ", unitateDeMasura=" + unitateDeMasura + ", nrCalorii=" + nrCalorii + "]";
	}

}
