package auto.ch.moser.model.motor;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Hersteller;

public class Verbrennungsmotor extends Motor {
	
	String typ;
	float hubraum;
	
	public Verbrennungsmotor(float leistung, Hersteller hersteller, String typ, float hubraum) {
		
		super(leistung, hersteller);
		
		this.typ = typ;
		this.hubraum = hubraum;
		
	}

	@Override
	public boolean executeCommand(String path) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Motordaten");
					System.out.println("Typ: " + typ);
					System.out.println("Hubraum: " + hubraum);
				case "setHubraum":
					if (!testCommandLenght(command)) break;
					hubraum = Float.parseFloat(command[1]);
					System.out.println("Hubraum erfolgreich auf " + hubraum + " gesetzt");
				case "setTyp":
					if (!testCommandLenght(command)) break;
					typ = command[1];
					System.out.println("Typ erfolgreich auf " + typ + " gesetzt." );
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
