package project.calories.model;

import java.util.List;

public interface Database {

	FoodLog getFoodLogby(int ziua, int luna, int anul, int ora, String aliment, int cantitate, String unitate);

	Management getManagementby(String nume, String unitateDeMasura, int nrCalorii);

	void addAliment(Aliment aliment);

	void addFoodLog(FoodLog foodlog);

	void addManagement(Management management);

	void editFoodlog(int ziua, int luna, int anul, int ora, String aliment, int cantitate, String unitate);

	void editManagement(String nume, String unitateDeMasura, int nrCalorii);

	List<FoodLog> getFoodLog();

	List<Management> getManagement();

	List<Aliment> getAlimente();

	void clearAlimente();

	void clearManagement();

	void clearFoodlog();

	Aliment getAlimentByName(String text);
}
