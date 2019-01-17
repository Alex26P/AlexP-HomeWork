package project.calories.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddAction() {
		super("a", "Add");
	}

	@Override
	public void doAction() {
		String nume = keyboard.getText("Nume: ");
		int unitateDeMasura = keyboard.getInt("Unitate de masura: ");
		int nrCalorii = keyboard.getInt("Numar calorii per unitate de masura: ");
		// do something with values
	}

}
