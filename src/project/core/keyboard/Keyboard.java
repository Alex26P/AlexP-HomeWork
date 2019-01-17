package project.core.keyboard;

import java.util.Scanner;

public class Keyboard {
	private Scanner kb = new Scanner(System.in);

	private static Keyboard instance = new Keyboard();

	public static Keyboard getInstance() {
		return instance;
	}

	public String getText(String msg) {
		System.out.println(msg);
		String text = kb.nextLine();
		return text;
	}

	public int getInt(String message) {
		System.out.print(message);
		int value = kb.nextInt();
		kb.nextLine();
		return value;
	}

}
