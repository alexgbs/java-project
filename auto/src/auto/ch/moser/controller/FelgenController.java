package auto.ch.moser.controller;

import auto.ch.moser.model.Felgen;

public class FelgenController extends ModelController<Felgen> {

	@Override
	public boolean controll(String path, Felgen model) {
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
				System.out.println("Felgen erfolgreich auf " + model.getFarbe() + " gesetzt");
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Felgendaten");
				System.out.println("Felgen: " + model.getFarbe());
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
