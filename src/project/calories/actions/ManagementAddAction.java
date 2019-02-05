package project.calories.actions;

import java.util.HashMap;

import project.calories.ApplicationSession;
import project.calories.model.Aliment;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class ManagementAddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ManagementAddAction() {
		super("a", "Add");
	}

	@Override
	public void doAction() {
		String nume = keyboard.getString("Nume: ");
		String unitateDeMasura = keyboard.getString("Unitate de masura: ");
		int nrCalorii = keyboard.getInt("Numar calorii per unitate de masura: ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(unitateDeMasura, nrCalorii);
		Aliment aliment = new Aliment(nume, map);
		ApplicationSession.getInstance().getDatabase().addAliment(aliment);

	}

}
