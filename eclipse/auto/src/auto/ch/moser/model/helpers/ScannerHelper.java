package auto.ch.moser.model.helpers;

import java.util.Scanner;

public abstract class ScannerHelper {
	private Scanner scanner;

	public String[] readLine() {
		
		String value = getScanner().nextLine();
		return value.split(" ");
	}
	
	private Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
