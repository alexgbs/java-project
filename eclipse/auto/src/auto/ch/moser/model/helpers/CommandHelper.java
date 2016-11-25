package auto.ch.moser.model.helpers;

import java.util.Scanner;

public abstract class CommandHelper {
	private Scanner scanner;

	public String[] readLine() {
		
		String value = getScanner().nextLine();
		return value.split(" ");
	}
	
	public boolean testCommandLenght(Object[] o, int lenght) {
		if(o.length != lenght) {
			System.out.println("Falsche Anzahl Parameter");
			return false;
		}
		return true;
	}
	
	public boolean testCommandLenght(Object[] o) {
		return testCommandLenght(o, 2);
	}
	
	private Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
