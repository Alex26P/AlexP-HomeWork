package project.calories.actions;

import project.core.menu.MenuItem;

public class EditAction extends MenuItem {
	public EditAction() {
		super("b", "Edit");
	}

	@Override
	public void doAction() {
		System.out.println("Aici editam ceva");
	}
}
