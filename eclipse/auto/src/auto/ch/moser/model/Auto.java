package auto.ch.moser.model;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

import auto.ch.moser.model.helpers.ScannerHelper;
import auto.ch.moser.model.motor.Motor;

public class Auto extends ScannerHelper implements Commandable {
	
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
			case "getAuto":
				Auto a = auto.get(command[1]);
				if(a == null) {
					System.out.println("Dieses Auto existiert nicht!");
					break;
				}
				modified = a.executeCommand();
				break;
			case "end":
				end = true;
				break;
			case "listAll":
				
				default:
					
			}
			if(modified) {
				Gson gson = new Gson();
				try {
					gson.toJson(auto, new FileWriter("file"));
				} catch (JsonIOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return modified;
	}
}
