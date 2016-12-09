package auto.ch.moser.model.motor;

import auto.ch.moser.model.Hersteller;

public class Verbrennungsmotor extends Motor {
	
	String typ;
	float hubraum;
	
	/**
	 * Erstellung eines Verbrennungsmotors
	 * 
	 * @param leistung
	 * @param hersteller
	 * @param typ
	 * @param hubraum
	 */
	public Verbrennungsmotor(float leistung, Hersteller hersteller, String typ,
			float hubraum) {
		super(leistung, hersteller);
		this.typ = typ;
		this.hubraum = hubraum;
	}

	/**
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * @param typ the typ to set
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	/**
	 * @return the hubraum
	 */
	public float getHubraum() {
		return hubraum;
	}

	/**
	 * @param hubraum the hubraum to set
	 */
	public void setHubraum(float hubraum) {
		this.hubraum = hubraum;
	}

	
}
