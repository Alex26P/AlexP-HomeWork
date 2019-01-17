package project.calories.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddAction2 extends MenuItem {

	public AddAction2() {
		super("a", "Add");

	}

	private Keyboard keyboard = Keyboard.getInstance();

	@Override
	public void doAction() {
		int data = keyboard.getInt("Data: ");
		int ora = keyboard.getInt("Ora: ");
		String aliment = keyboard.getText("Aliment: ");
		int cantitate = keyboard.getInt("Cantitate: ");

	}

}
