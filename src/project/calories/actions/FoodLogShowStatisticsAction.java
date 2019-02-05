package project.calories.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
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

		generateHTML(foodLog);
	}

	private void generateHTML(List<FoodLog> foodLog) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(new File("test.html")));

			pw.println("<TABLE border=1 >");
			pw.println("<TR>");
			pw.println("<Th>Data</Th>");
			pw.println("<Th>Aliment</Th>");
			pw.println("<Th>Qty</Th>");
			pw.println("<Th>Unit</Th>");
			pw.println("<Th>Calories</Th>");
			pw.println("</TR>");
			for (FoodLog fl : foodLog) {
				pw.println("<TR>");
				pw.println("<TD>" + fl.getAnul() + fl.getLuna() + fl.getZiua() + "</TD>");
				pw.println("<TD>" + fl.getAliment().getNume() + "</TD>");
				pw.println("<TD>" + fl.getCantitate() + "</TD>");
				pw.println("<TD>" + fl.getUnitate() + "</TD>");
				pw.println("<TD>" + fl.getCalorii() + "</TD>");
				pw.println("</TR>");
			}

			pw.println("</TABLE>");

			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
