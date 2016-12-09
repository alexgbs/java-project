package auto.ch.moser.model.motor;

import auto.ch.moser.model.Hersteller;

public class Verbrennungsmotor extends Motor {
	
	String typ;
	float hubraum;
	
	public Verbrennungsmotor(float leistung, Hersteller hersteller, String typ, float hubraum) {
		
		super(leistung, hersteller);
		
		this.typ = typ;
		this.hubraum = hubraum;
		
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public float getHubraum() {
		return hubraum;
	}

	public void setHubraum(float hubraum) {
		this.hubraum = hubraum;
	}

	@Override
	public String anlassen() {
		return "brummm brumm... Motor erfolgreich gestartet";		
	}

	@Override
	public String ausschalten() {
		return "brummm brumm... Motor erfolgreich ausgeschalten";		
	}
	
}
