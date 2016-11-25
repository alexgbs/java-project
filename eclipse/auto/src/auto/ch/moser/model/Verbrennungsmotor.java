package auto.ch.moser.model;

public class Verbrennungsmotor extends Motor {
	
	String typ;
	float hubraum;
	
	Verbrennungsmotor(float leistung, Hersteller hersteller, String typ, float hubraum) {
		
		super(leistung, hersteller);
		
		this.typ = typ;
		this.hubraum = hubraum;
		
	}
	
}
