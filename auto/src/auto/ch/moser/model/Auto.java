package auto.ch.moser.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import auto.ch.moser.model.helpers.CommandHelper;
import auto.ch.moser.model.motor.Elektromotor;
import auto.ch.moser.model.motor.Motor;
import auto.ch.moser.model.motor.Verbrennungsmotor;

public class Auto extends CommandHelper implements Commandable {
	
	String karosserieFarbe;
	Felgen felgen;
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
				if(sitze.get(command[1]) != null) {
					System.out.println("Sitz existiert bereits!!");
					break;
				}
				Sitz sitz1 = new Sitz(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), command[1], false, false, false, null, null, null);
				sitze.put(command[1], sitz1);
				break;
			case "getFelgen":
				if(!testCommandLenght(command, 1)) break;
				if(felgen == null) felgen = new Felgen(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), null);
				modified = felgen.executeCommand();
			case "getReifen":
				if(!testCommandLenght(command, 1)) break;
				if(reifen == null) reifen = new Reifen(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), 0, null);
				modified = reifen.executeCommand();
			case "getMotor":
				if(!testCommandLenght(command, 1)) break;
				if(motor == null) motor = new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0);
				modified = motor.executeCommand();
			case "createMotor":
				if(!testCommandLenght(command)) break;
				if(command[1].equals("Verbrennungsmotor"))
					motor = new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0);
				if(command[1].equals("Dieselmotor"))
					motor = new Elektromotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"));
			case "list":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Autodaten");
				System.out.println("Karosserie: " + karosserieFarbe);
				System.out.println("Felgen: " + felgen);
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
