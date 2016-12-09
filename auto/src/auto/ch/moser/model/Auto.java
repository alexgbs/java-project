package auto.ch.moser.model;

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
	
	/**
	 * Erstellung eines Autos	
	 * @param hersteller Hersteller
	 * @param karosserieFarbe Karosseriefarbe
	 * @param felgen Felgen
	 * @param reifen Reifen
	 * @param sitze Sitze
	 * @param motor Motor
	 */

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
	
	/**
	 * @return the karosserieFarbe
	 */
	public String getKarosserieFarbe() {
		return karosserieFarbe;
	}

	/**
	 * @param karosserieFarbe the karosserieFarbe to set
	 */
	public void setKarosserieFarbe(String karosserieFarbe) {
		this.karosserieFarbe = karosserieFarbe;
	}

	/**
	 * @return the felgen
	 */
	public Felgen getFelgen() {
		return felgen;
	}

	/**
	 * @param felgen the felgen to set
	 */
	public void setFelgen(Felgen felgen) {
		this.felgen = felgen;
	}

	/**
	 * @return the reifen
	 */
	public Reifen getReifen() {
		return reifen;
	}

	/**
	 * @param reifen the reifen to set
	 */
	public void setReifen(Reifen reifen) {
		this.reifen = reifen;
	}

	/**
	 * @return the sitze
	 */
	public Map<String, Sitz> getSitze() {
		return sitze;
	}

	/**
	 * @param sitze the sitze to set
	 */
	public void setSitze(Map<String, Sitz> sitze) {
		this.sitze = sitze;
	}

	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}

	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * @return the hersteller
	 */
	public Hersteller getHersteller() {
		return hersteller;
	}

	/**
	 * @param hersteller the hersteller to set
	 */
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}

	@Override
	public int compareTo(Auto o) {
		return o.getKarosserieFarbe().compareTo(getKarosserieFarbe());
	}
}
