package auto.ch.moser.controller;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Reifen;

/**
 * Controller für {@link Reifen} für die Benutzung in der Commandozeile
 * @author moser.damian
 *
 */
public class ReifenController extends ModelController<Reifen> {

	@Override
	public boolean controll(String path, Reifen model) {
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
			case "setBreite":
				if(!testCommandLenght(command)) break;
				model.setBreite(Float.parseFloat(command[1]));
				System.out.println("Breite erfolgreich auf " + model.getBreite() + " gesetzt");
				break;
			case "setArt":
				if(!testCommandLenght(command)) break;
				model.setArt(command[1]);
				System.out.println("Art erfolgreich auf " + model.getArt() + " gesetzt");
				modified = true;
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Herstellerdaten:");
				System.out.println("Breite: " + model.getBreite());
				System.out.println("Art: " + model.getArt());
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setBreite");
				System.out.println("SetArt");
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
