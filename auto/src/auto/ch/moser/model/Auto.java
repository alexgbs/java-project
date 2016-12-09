package auto.ch.moser.model;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import auto.ch.moser.model.motor.Motor;

public class Auto implements Comparable<Auto> {
	
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

	public Felgen getFelgen() {
		return felgen;
	}
	public void setFelgen(Felgen felgen) {
		this.felgen = felgen;
	}
	public Reifen getReifen() {
		return reifen;
	}
	public void setReifen(Reifen reifen) {
		this.reifen = reifen;
	}
	public Map<String, Sitz> getSitze() {
		return sitze;
	}
	public void setSitze(Map<String, Sitz> sitze) {
		this.sitze = sitze;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Hersteller getHersteller() {
		return hersteller;
	}
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}
	@Override
	public int compareTo(Auto o) {
		return o.getKarosserieFarbe().compareTo(getKarosserieFarbe());
	}
}
