package auto.ch.moser.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import auto.ch.moser.model.helpers.CommandHelper;
import auto.ch.moser.model.motor.Motor;

public class Auto extends CommandHelper implements Commandable {
	
	String karosserieFarbe;
	String sitzFarbe;
	String sitzBezugsArt;
	Felgen felgen;
	Kopfstuetze kopfstuetze;
	Reifen reifen;
	Sitz sitz;
	Motor motor;
	
		

	public String getKarosserieFarbe() {
		return karosserieFarbe;
	}
	public void setKarosserieFarbe(String karosserieFarbe) {
		this.karosserieFarbe = karosserieFarbe;
	}
	public String getSitzFarbe() {
		return sitzFarbe;
	}
	public void setSitzFarbe(String sitzFarbe) {
		this.sitzFarbe = sitzFarbe;
	}
	public String getSitzBezugsArt() {
		return sitzBezugsArt;
	}
	public void setSitzBezugsArt(String sitzBezugsArt) {
		this.sitzBezugsArt = sitzBezugsArt;
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
				end = true;
				break;
			case "setKarosserie":
				karosserieFarbe = command[1];
				
				break;
			case "listKarosserie":
				break;
			case "list":
				break;
				default:
					
			}
		}
		return modified;
	}
}
