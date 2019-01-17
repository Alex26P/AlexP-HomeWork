package project.calories;

import project.calories.actions.AddAction;
import project.calories.actions.AddAction2;
import project.calories.actions.DeleteAction;
import project.calories.actions.DeleteAction2;
import project.calories.actions.EditAction;
import project.calories.actions.EditAction2;
import project.calories.actions.Statistics;
import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addMng = new AddAction();
		MenuItem editMng = new EditAction();
		MenuItem deleteMng = new DeleteAction();
		MenuItem addFood = new AddAction2();
		MenuItem editFood = new EditAction2();
		MenuItem deleteFood = new DeleteAction2();
		MenuItem statisticsFood = new Statistics();

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

		Menu readingsMenu = new Menu("1", "Readings");
		readingsMenu.addItem(mngAlimMenu);
		readingsMenu.addItem(foodLogMenu);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(readingsMenu);

		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
