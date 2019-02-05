package project.core.keyboard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import project.calories.ApplicationSession;
import project.calories.model.Aliment;

public class Keyboard {
	private static final String DATE_FORMAT = "dd.MM.yyyy";

	private Scanner kb = new Scanner(System.in);

	private static Keyboard instance = new Keyboard();

	public static Keyboard getInstance() {
		return instance;
	}

	public String getText() {
		return kb.nextLine();
	}

	public String getString(String message) {
		System.out.print(message);
		String value = kb.nextLine();
		return value;
	}

	public int getInt(String message) {
		System.out.print(message);
		int value = kb.nextInt();
		kb.nextLine();
		return value;
	}

	SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

	public Date getDate(String message) {
		while (true) {
			try {
				System.out.print(message + "[" + DATE_FORMAT + "]");
				String text = kb.nextLine();
				return sdf.parse(text);
			} catch (ParseException e) {
				System.out.println("Invalid date!!!");
			}
		}
	}

	public Aliment getAliment(String message) {
		System.out.print(message);
		String text = kb.nextLine();
		return ApplicationSession.getInstance().getDatabase().getAlimentByName(text);
	}

}
