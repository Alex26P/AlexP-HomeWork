package project.calories.actions;

import java.util.List;

import project.calories.ApplicationSession;
import project.calories.model.FoodLog;
import project.core.menu.MenuItem;

public class FoodLogShowStatisticsAction extends MenuItem {

	public FoodLogShowStatisticsAction() {
		super("d", "Statistics: nr de calorii consumate pe zi");

	}

	@Override
	public void doAction() {
		List<FoodLog> foodLog = ApplicationSession.getInstance().getDatabase().getFoodLog();
		for (FoodLog fl : foodLog) {
			System.out.println(fl);
		}
	}

}
