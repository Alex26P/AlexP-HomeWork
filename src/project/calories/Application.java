package project.calories;

import project.calories.actions.FoodLogAddAction;
import project.calories.actions.FoodLogDeleteAction;
import project.calories.actions.FoodLogEditAction;
import project.calories.actions.FoodLogShowStatisticsAction;
import project.calories.actions.ManagementAddAction;
import project.calories.actions.ManagementDeleteAction;
import project.calories.actions.ManagementEditAction;
import project.calories.model.Database;
import project.calories.utils.Serializer;
import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		Database database = serializer.load();
		if (database == null) {
			return;
		}

		ApplicationSession.getInstance().setDatabase(database);
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addMng = new ManagementAddAction();
		MenuItem editMng = new ManagementEditAction();
		MenuItem deleteMng = new ManagementDeleteAction();
		MenuItem addFood = new FoodLogAddAction();
		MenuItem editFood = new FoodLogEditAction();
		MenuItem deleteFood = new FoodLogDeleteAction();
		MenuItem statisticsFood = new FoodLogShowStatisticsAction();

		BackAction back = new BackAction("0", "Back");

		Menu mngAlimMenu = new Menu("1", "Management Alimente");
		mngAlimMenu.addItem(addMng);
		mngAlimMenu.addItem(editMng);
		mngAlimMenu.addItem(deleteMng);
		mngAlimMenu.addItem(back);
		mngAlimMenu.setBackAction(back);

		Menu foodLogMenu = new Menu("2", "Food Log");
		foodLogMenu.addItem(addFood);
		foodLogMenu.addItem(editFood);
		foodLogMenu.addItem(deleteFood);
		foodLogMenu.addItem(statisticsFood);

//		Menu readingsMenu = new Menu("1", "Readings");
//		readingsMenu.addItem(mngAlimMenu);
//		readingsMenu.addItem(foodLogMenu);

//		Menu mainMenu = new Menu("", "Main");
//		mainMenu.addItem(readingsMenu);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(mngAlimMenu);
		mainMenu.addItem(foodLogMenu);

		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
