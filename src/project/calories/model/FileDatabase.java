package project.calories.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.calories.ApplicationSession;
import project.calories.utils.Serializer;

public class FileDatabase implements Database, Serializable {

	private static final long serialVersionUID = 1L;

	private List<FoodLog> foodlogs = new ArrayList<FoodLog>();
	private List<Aliment> alimente = new ArrayList<Aliment>();
	private List<Management> management2 = new ArrayList<Management>();

	@Override
	public void addAliment(Aliment aliment) {
		alimente.add(aliment);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addFoodLog(FoodLog foodlog) {
		foodlogs.add(foodlog);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void addManagement(Management management) {
		management2.add(management);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Aliment> getAlimente() {
		return alimente;
	}

	@Override
	public List<FoodLog> getFoodLog() {
		return foodlogs;
	}

	@Override
	public List<Management> getManagement() {
		// TODO Auto-generated method stub
		return management2;
	}

	@Override
	public void clearAlimente() {
		alimente.clear();
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void clearFoodlog() {
		foodlogs.clear();
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public void clearManagement() {
		management2.clear();
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public FoodLog getFoodLogby(int ziua, int luna, int anul, int ora, String aliment, int cantitate, String unitate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Management getManagementby(String nume, String unitateDeMasura, int nrCalorii) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editFoodlog(int ziua, int luna, int anul, int ora, String aliment, int cantitate, String unitate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void editManagement(String nume, String unitateDeMasura, int nrCalorii) {
		// TODO Auto-generated method stub

	}

	@Override
	public Aliment getAlimentByName(String name) {
		for (Aliment a : alimente) {
			if (a.hasName(name)) {
				return a;
			}
		}
		return null;
	}

}
