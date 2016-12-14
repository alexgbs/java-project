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
	 * @param s Command welcher �berpr�ft wird
	 * @param lenght erlaubte l�nge, welche das Array haben muss
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
	 * �berpr�ft die l�nge des Mitgegebenen Parameters nach der gr�sse, damit keine zu langen || zu kurzne
	 * Kommandos eingegeben werden k�nnen.
	 * Hier wird der Defaultwert von 2 f�r die L�nge genommenm
	 * @param s Command welcher �berpr�ft wird
	 * @return true wenn s gleichgross wie 2, sonst false
	 */
	
	public boolean testCommandLenght(String[] s) {
		return testCommandLenght(s, 2);
	}
	
	/**
	 * Lazyloading f�r Scanner. Wird nur intern genutzt.
	 * @return initialisierten scanner
	 */
	
	private Scanner getScanner() {
		if(scanner == null) {
			scanner = new Scanner(System.in);
		}
		return scanner;
	}
}
