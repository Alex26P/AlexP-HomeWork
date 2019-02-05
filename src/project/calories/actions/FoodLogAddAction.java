package project.calories.actions;

import project.calories.ApplicationSession;
import project.calories.model.FoodLog;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class FoodLogAddAction extends MenuItem {

	public FoodLogAddAction() {
		super("a", "Add");

	}

	private Keyboard keyboard = Keyboard.getInstance();

	@Override
	public void doAction() {
		int ziua = keyboard.getInt("Ziua: ");
		int luna = keyboard.getInt("Luna: ");
		int anul = keyboard.getInt("Anul: ");
		int ora = keyboard.getInt("Ora: ");
		String aliment = keyboard.getString("Aliment: ");
		int cantitate = keyboard.getInt("Cantitate: ");
		String unitate = keyboard.getString("Unitate: ");

		FoodLog foodlog = new FoodLog(ziua, luna, anul, ora, aliment, cantitate, unitate);
		ApplicationSession.getInstance().getDatabase().addFoodLog(foodlog);

	}

}
