package auto.ch.moser.model.motor;

import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.helpers.ScannerHelper;

public abstract class Motor extends ScannerHelper implements Commandable {

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
