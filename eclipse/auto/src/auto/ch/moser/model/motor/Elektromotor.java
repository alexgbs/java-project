package auto.ch.moser.model.motor;

import auto.ch.moser.model.Hersteller;

public class Elektromotor extends Motor {

	Elektromotor(float leistung, Hersteller hersteller) {
		super(leistung, hersteller);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean executeCommand() {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println("Werkstatt:>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Motordaten");
					System.out.println("Typ: Elektromotor");
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
