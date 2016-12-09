package auto.ch.moser.model.motor;

import auto.ch.moser.controller.helpers.CommandHelper;
import auto.ch.moser.model.Hersteller;

public abstract class Motor extends CommandHelper {

	float leistung;
	Hersteller hersteller;
	
	/**
	 * Erstellung eines Motors
	 * @param leistung Leistung des Motors
	 * @param hersteller Hersteller des Motors
	 */
	Motor(float leistung, Hersteller hersteller) {
		this.leistung = leistung;
		this.hersteller = hersteller;
	}

	/**
	 * @return the leistung
	 */
	public float getLeistung() {
		return leistung;
	}

	/**
	 * @param leistung the leistung to set
	 */
	public void setLeistung(float leistung) {
		this.leistung = leistung;
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
	
}
