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

public class Auto {
	
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
}
