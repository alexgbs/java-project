package auto.ch.moser.controller;

import auto.ch.moser.model.motor.Elektromotor;
import auto.ch.moser.model.motor.MotorSteuern;

public class ElektromotorController extends ModelController<Elektromotor> implements MotorSteuern{

	@Override
	public boolean controll(String path, Elektromotor model) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Motordaten");
					System.out.println("Typ: Elektromotor");
					break;
				case "motorStarten":
					if (!testCommandLenght(command,1)) break;
					System.out.println(anlassen());
					break;
				case "motorAusschalten":
					if (!testCommandLenght(command,1)) break;
					System.out.println(ausschalten());
					break;
				case "return":
					if (!testCommandLenght(command,1)) break;
					end = true;
					break;
				case "commands":
					if(!testCommandLenght(command, 1)) break;
					System.out.println("Alle Commands:");
					System.out.println("motorStarten");
					System.out.println("motorAusschalten");
					System.out.println("list");
					System.out.println("return");
					break;
				default:
					System.out.println("Komando nicht gefunden!");
			}
		}
		return modified;
	}
	

	@Override
	public String anlassen() {
		return "bzz bzz... Motor erfolgreich gestartet";		
	}

	@Override
	public String ausschalten() {
		return "bzz bzz... Motor erfolgreich ausgeschalten";		
	}

}
