package project.calories.actions;

import project.calories.ApplicationSession;
import project.core.menu.MenuItem;

public class ManagementDeleteAction extends MenuItem {

	public ManagementDeleteAction() {
		super("c", "Delete");
	}

	@Override
	public void doAction() {
		ApplicationSession.getInstance().getDatabase().clearManagement();
		ApplicationSession.getInstance().getDatabase().clearAlimente();

	}

}
