package auto.ch.moser.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
	Hersteller hersteller;
	
		

	public Auto(Hersteller hersteller, String karosserieFarbe, Felgen felgen, Reifen reifen,
			Map<String, Sitz> sitze, Motor motor) {
		super();
		this.karosserieFarbe = karosserieFarbe;
		this.felgen = felgen;
		this.reifen = reifen;
		this.sitze = (sitze == null ? new HashMap<String, Sitz>() : sitze);
		this.motor = motor;
		this.hersteller = hersteller;
	}
	public String getKarosserieFarbe() {
		return karosserieFarbe;
	}
	public void setKarosserieFarbe(String karosserieFarbe) {
		this.karosserieFarbe = karosserieFarbe;
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
			case "setKarosserie":
				if(!testCommandLenght(command)) break;
				karosserieFarbe = command[1];
				System.out.println("Karosserie erfolgreich auf " + karosserieFarbe + " gesetzt");
				break;
			case "getSitz":
				if(!testCommandLenght(command)) break;
				Sitz sitz = sitze.get(command[1]);
				if(sitz == null) sitz = new Sitz(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), command[1], false, false, false, null, null, null);
				modified = sitz.executeCommand(path + "\\sitz(" + command[1] + ")");
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
				modified = felgen.executeCommand(path + "\\felgen");
				break;
			case "getReifen":
				if(!testCommandLenght(command, 1)) break;
				if(reifen == null) reifen = new Reifen(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), 0, null);
				modified = reifen.executeCommand(path + "\\reifen");
				break;
			case "getMotor":
				if(!testCommandLenght(command, 1)) break;
				if(motor == null) motor = new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0);
				modified = motor.executeCommand(path + "\\motor" + (motor instanceof Verbrennungsmotor ? "(Verbrennungsmotor)" : "(Elektromotor)"));
				break;
			case "getHersteller":
				if(!testCommandLenght(command, 1)) break;
				if(hersteller == null) hersteller = new Hersteller("Alex und Damian GmbH", "Silicon Valey");
				modified = hersteller.executeCommand(path + "\\hersteller");
				break;
			case "createMotor":
				if(!testCommandLenght(command)) break;
				if(command[1].equals("Verbrennungsmotor"))
					motor = new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0);
				else if(command[1].equals("Dieselmotor"))
					motor = new Elektromotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"));
				else
					System.out.println("Diesen Motortyp gibt es nicht");
				break;
			case "list":
				if(!testCommandLenght(command, 1)) break;
				list();
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setKarosserie");
				System.out.println("getSitz");
				System.out.println("createSitz");
				System.out.println("getFelgen");
				System.out.println("getReifen");
				System.out.println("getMotor");
				System.out.println("setKarosserie");
				System.out.println("getHersteller");
				System.out.println("createMotor");
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
	
	public void list() {
		System.out.println("Autodaten");
		System.out.println("Karosserie: " + karosserieFarbe);
		System.out.println("Felgen: " + felgen);
		System.out.println("Reifen: " + reifen);
		sitze.keySet().forEach(e -> System.out.println("Sitz: " + e));
		System.out.println("Motor: " + motor);
	}
}
