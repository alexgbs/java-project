package auto.ch.moser.controller;

import auto.ch.moser.model.motor.MotorSteuern;
import auto.ch.moser.model.motor.Verbrennungsmotor;

public class VerbrennungsmotorController extends ModelController<Verbrennungsmotor> implements MotorSteuern {

	@Override
	public boolean controll(String path, Verbrennungsmotor model) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Motordaten");
					System.out.println("Typ: " + model.getTyp());
					System.out.println("Hubraum: " + model.getHubraum());
				case "setHubraum":
					if (!testCommandLenght(command)) break;
					model.setHubraum(Float.parseFloat(command[1]));
					System.out.println("Hubraum erfolgreich auf " + model.getHubraum() + " gesetzt");
				case "setTyp":
					if (!testCommandLenght(command)) break;
					model.setTyp(command[1]);
					System.out.println("Typ erfolgreich auf " + model.getTyp() + " gesetzt." );
				case "motorStarten":
					if (!testCommandLenght(command,1)) break;
					System.out.println(anlassen());
				case "motorAusschalten":
					if (!testCommandLenght(command,1)) break;
					System.out.println(ausschalten());
				case "return":
					if (!testCommandLenght(command,1)) break;
					end = true;
					break;
				case "commands":
					if(!testCommandLenght(command, 1)) break;
					System.out.println("Alle Commands:");
					System.out.println("setHubraum");
					System.out.println("setTyp");
					System.out.println("motorStarten");
					System.out.println("motorAusschalten");
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
	

	@Override
	public String anlassen() {
		return "brummm brumm... Motor erfolgreich gestartet";		
	}

	@Override
	public String ausschalten() {
		return "brummm brumm... Motor erfolgreich ausgeschalten";		
	}
	

}