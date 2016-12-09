package auto.ch.moser.controller.helpers;

import java.util.Scanner;
/**
 * Hilft f�r die Commandozeileneingabe und evaluation der eingegebenen Commands
 * @author moser.damian
 *
 */

public abstract class CommandHelper {
	private Scanner scanner;

	/**
	 * Liest die Linie ein und spaltet das Resultat nach den Lehrschl�gen
	 * @return	Eingegebene Linie getrennt in Worte
	 */
	public String[] readLine() {		
		String value = getScanner().nextLine();
		return value.split(" ");
	}
	
	/**
	 * �berpr�ft die l�nge des Mitgegebenen Parameters nach der gr�sse, damit keine zu langen || zu kurzne
	 * Kommandos eingegeben werden k�nnen
	 * @param o	Arraycommand
	 * @param lenght erlaubte l�nge, welche das Array haben muss
	 * @return
	 */
	
	public boolean testCommandLenght(String[] s, int lenght) {
		if(s.length != lenght) {
			System.out.println("Falsche Anzahl Parameter");
			return false;
		}
		return true;
	}
	
	public boolean testCommandLenght(String[] s) {
		return testCommandLenght(s, 2);
	}
	
	private Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
