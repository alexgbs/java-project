package auto.ch.moser.controller;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Kopfstuetze;

/**
 * Controller für {@link Kopfstuetze} für die Benutzung in der Commandozeile
 * @author moser.damian
 *
 */
public class KopfstuetzeController extends ModelController<Kopfstuetze> {

	@Override
	public boolean controll(String path, Kopfstuetze model) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
			case "return":
				if(!testCommandLenght(command, 1)) break;
				end = true;
				break;
			case "setFarbe":
				if(!testCommandLenght(command)) break;
				model.setFarbe(command[1]);
				System.out.println("Farbe erfolgreich auf " + model.getFarbe() + " gesetzt");
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Kopfstützendaten:");
				System.out.println("Farbe: " + model.getFarbe());
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setFarbe");
				System.out.println("list");
				System.out.println("return");
				break;
				default:
					System.out.println("Komando nicht gefunden!");
					break;
			}
		}
		return modified;
	}

}
