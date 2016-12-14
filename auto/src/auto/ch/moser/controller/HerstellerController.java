package auto.ch.moser.controller;

import auto.ch.moser.model.Hersteller;

/**
 * Controller für {@link Hersteller} für die Benutzung in der Commandozeile
 * @author moser.damian
 *
 */
public class HerstellerController extends ModelController<Hersteller> {

	@Override
	public boolean controll(String path, Hersteller model) {
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
			case "setName":
				if(!testCommandLenght(command)) break;
				model.setName(command[1]);
				System.out.println("Name erfolgreich auf " + model.getStandort() + " gesetzt");
				break;
			case "setStandort":
				if(!testCommandLenght(command)) break;
				model.setStandort(command[1]);
				System.out.println("Standort erfolgreich auf " + model.getStandort() + " gesetzt");
				modified = true;
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Herstellerdaten:");
				System.out.println("Name: " + model.getName());
				System.out.println("Standort: " + model.getStandort());
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setName");
				System.out.println("setStandort");
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
