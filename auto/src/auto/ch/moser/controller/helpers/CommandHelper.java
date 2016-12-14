package auto.ch.moser.controller.helpers;

import java.util.Scanner;
/**
 * Hilft für die Commandozeileneingabe und evaluation der eingegebenen Commands
 * @author moser.damian
 *
 */

public abstract class CommandHelper {
	private Scanner scanner;

	/**
	 * Liest die Linie ein und spaltet das Resultat nach den Lehrschlägen
	 * @return	Eingegebene Linie getrennt in Worte
	 */
	public String[] readLine() {		
		String value = getScanner().nextLine();
		return value.split(" ");
	}
	
	/**
	 * Überprüft die länge des Mitgegebenen Parameters nach der grösse, damit keine zu langen || zu kurzne
	 * Kommandos eingegeben werden können
	 * @param s Command welcher überprüft wird
	 * @param lenght erlaubte länge, welche das Array haben muss
	 * @return true wenn s gleichgross wie lenght, sonst false
	 */
	
	public boolean testCommandLenght(String[] s, int lenght) {
		if(s.length != lenght) {
			System.out.println("Falsche Anzahl Parameter");
			return false;
		}
		return true;
	}
	
	/**
	 * Überprüft die länge des Mitgegebenen Parameters nach der grösse, damit keine zu langen || zu kurzne
	 * Kommandos eingegeben werden können.
	 * Hier wird der Defaultwert von 2 für die Länge genommenm
	 * @param s Command welcher überprüft wird
	 * @return true wenn s gleichgross wie 2, sonst false
	 */
	
	public boolean testCommandLenght(String[] s) {
		return testCommandLenght(s, 2);
	}
	
	/**
	 * Lazyloading für Scanner. Wird nur intern genutzt.
	 * @return initialisierten scanner
	 */
	
	private Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
