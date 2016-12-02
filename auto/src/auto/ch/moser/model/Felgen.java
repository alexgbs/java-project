package auto.ch.moser.model;

import auto.ch.moser.model.motor.Elektromotor;
import auto.ch.moser.model.motor.Verbrennungsmotor;

public class Felgen extends Teil {
	String farbe;

	public Felgen(Hersteller hersteller, String farbe) {
		super(hersteller);
		this.farbe = farbe;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public boolean executeCommand(String path) {
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
				farbe = command[1];
				System.out.println("Karosserie erfolgreich auf " + farbe + " gesetzt");
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Felgendaten");
				System.out.println("Felgen: " + farbe);
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
