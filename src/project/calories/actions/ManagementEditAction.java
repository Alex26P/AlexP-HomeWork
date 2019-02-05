package project.calories.actions;

import project.calories.ApplicationSession;
import project.calories.model.Database;
import project.calories.model.Management;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class ManagementEditAction extends MenuItem {

	private Keyboard keyboard = Keyboard.getInstance();

	public ManagementEditAction() {
		super("b", "Edit");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String nume = keyboard.getString("Nume: ");
		String unitateDeMasura = keyboard.getString("Unitate de masura: ");
		int nrCalorii = keyboard.getInt("Numar calorii per unitate de masura: ");

		Management management = db.getManagementby(nume, unitateDeMasura, nrCalorii);
		if (management == null) {
			throw new RuntimeException("Management not found");
		}
//		db.editManagement(nume, unitateDeMasura, nrCalorii);
	}

}
