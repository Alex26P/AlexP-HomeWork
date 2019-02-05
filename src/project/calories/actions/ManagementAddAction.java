package project.calories.actions;

import project.calories.ApplicationSession;
import project.calories.model.Aliment;
import project.calories.model.UM;
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
		UM um = UM.valueOf(unitateDeMasura);

		int nrCalorii = keyboard.getInt("Numar calorii per unitate de masura: ");

		Aliment aliment = ApplicationSession.getInstance().getDatabase().getAlimentByName(nume);
		if (aliment != null) {
			aliment.addUM(um, nrCalorii);
		} else {
			aliment = new Aliment(nume);
			aliment.addUM(um, nrCalorii);
			ApplicationSession.getInstance().getDatabase().addAliment(aliment);
		}
	}

}
