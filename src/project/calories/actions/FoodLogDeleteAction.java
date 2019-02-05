package project.calories.actions;

import project.calories.ApplicationSession;
import project.core.menu.MenuItem;

public class FoodLogDeleteAction extends MenuItem {

	public FoodLogDeleteAction() {
		super("c", "Delete");

	}

	@Override
	public void doAction() {
		ApplicationSession.getInstance().getDatabase().clearFoodlog();

	}

}
