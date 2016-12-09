package auto.ch.moser.model;

import auto.ch.moser.model.motor.Elektromotor;
import auto.ch.moser.model.motor.Verbrennungsmotor;

public class Felgen extends Teil {
	String farbe;

	public Felgen(Hersteller hersteller, String farbe) {
		super(hersteller);
		this.farbe = farbe;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
}
