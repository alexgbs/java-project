package auto.ch.moser.model;

import java.util.ArrayList;

public class Auto implements Commandable {
	
	String karosserieFarbe;
	String sitzFarbe;
	String sitzBezugsArt;
	Felgen felgen;
	Kopfstütze kopfstuetze;
	Reifen reifen;
	Sitz sitz;
		
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
		// TODO Auto-generated method stub
		return false;
	}
}
