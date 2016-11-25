package auto.ch.moser.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import auto.ch.moser.model.helpers.CommandHelper;
import auto.ch.moser.model.motor.Motor;

public class Auto extends CommandHelper implements Commandable {
	
	String karosserieFarbe;
	Felgen felgen;
	Kopfstuetze kopfstuetze;
	Reifen reifen;
	Map<String, Sitz> sitze;
	Motor motor;
	
		

	public String getKarosserieFarbe() {
		return karosserieFarbe;
	}
	public void setKarosserieFarbe(String karosserieFarbe) {
		this.karosserieFarbe = karosserieFarbe;
	}

	@Override
	public boolean executeCommand() {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println("Werkstatt:>");
			String[] command = readLine();
			switch(command[0]) {
			case "return":
				if(!testCommandLenght(command, 1)) break;
				end = true;
				break;
			case "setKarosserie":
				if(!testCommandLenght(command)) break;
				karosserieFarbe = command[1];
				System.out.println("Karosserie erfolgreich auf " + karosserieFarbe + " gesetzt");
				break;
			case "getSitz":
				if(!testCommandLenght(command)) break;
				Sitz sitz = sitze.get(command[1]);
				if(sitz == null) sitz = new Sitz(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), command[1], false, false, false, null, null, null);
				modified = sitz.executeCommand();
				break;
			case "createSitz":
				if(!testCommandLenght(command)) break;
				
			case "list":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Autodaten");
				System.out.println("Karosserie: " + karosserieFarbe);
				System.out.println("Felgen: " + felgen);
				System.out.println("Kopfstuetze: " + kopfstuetze);
				System.out.println("Reifen: " + reifen);
				sitze.keySet().forEach(e -> System.out.println("Sitz: " + e));
				System.out.println("Motor: " + motor);
				break;
				default:
					
			}
		}
		return modified;
	}
}
