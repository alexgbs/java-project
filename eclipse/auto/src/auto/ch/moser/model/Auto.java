package auto.ch.moser.model;

import java.util.ArrayList;

public class Auto implements Commandable {
	
	String karosserieFarbe;
	String sitzFarbe;
	String sitzBezugsArt;
<<<<<<< HEAD
	Felgen felgen;
	Kopfstütze kopfstuetze;
	Reifen reifen;
	Sitz sitz;
		
=======
	
	public ArrayList<Teil> getTeile() {
		return teile;
	}
	public void setTeile(ArrayList<Teil> teile) {
		this.teile = teile;
	}
>>>>>>> 873cc7190218d2554b3c657c8420ca4afa095371
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
