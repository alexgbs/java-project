package auto.ch.moser.model.helpers;

import java.util.Scanner;

public abstract class ScannerHelper {

	public String[] readLine() {
		
		Scanner scanner= new Scanner(System.in);
		String value = scanner.nextLine();
		return value.split(" ");
	}
	
}
