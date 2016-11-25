package auto.ch.moser.model;

public abstract class Motor {

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
