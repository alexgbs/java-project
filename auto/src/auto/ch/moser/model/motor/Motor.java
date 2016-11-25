package auto.ch.moser.model.motor;

import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.helpers.CommandHelper;

public abstract class Motor extends CommandHelper implements Commandable, MotorSteuern {

	float leistung;
	Hersteller hersteller;
	
	Motor(float leistung, Hersteller hersteller) {
		this.leistung = leistung;
		this.hersteller = hersteller;
	}
	
	public float getLeistung() {
		return leistung;
	}
	public void setLeistung(float leistung) {
		this.leistung = leistung;
	}
	public Hersteller getHersteller() {
		return hersteller;
	}
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}

}
