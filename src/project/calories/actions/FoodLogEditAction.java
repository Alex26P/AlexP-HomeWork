package project.calories.actions;

import project.calories.ApplicationSession;
import project.calories.model.Database;
import project.calories.model.FoodLog;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class FoodLogEditAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public FoodLogEditAction() {
		super("b", "Edit");

	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		int ziua = keyboard.getInt("Ziua: ");
		int luna = keyboard.getInt("Luna: ");
		int anul = keyboard.getInt("Anul: ");
		int ora = keyboard.getInt("Ora: ");
		String aliment = keyboard.getString("Aliment: ");
		int cantitate = keyboard.getInt("Cantitate: ");
		String unitate = keyboard.getString("Unitate: ");

		FoodLog foodlog = db.getFoodLogby(ziua, luna, anul, ora, aliment, cantitate, unitate);
		if (foodlog == null) {
			throw new RuntimeException("FoodLog not found");
		}
//		db.editFoodlog(ziua, luna, anul, ora, aliment, cantitate, unitate);
	}
}
