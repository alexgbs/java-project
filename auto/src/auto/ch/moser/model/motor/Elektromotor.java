package auto.ch.moser.model.motor;

import auto.ch.moser.model.Hersteller;

public class Elektromotor extends Motor {

	public Elektromotor(float leistung, Hersteller hersteller) {
		super(leistung, hersteller);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String anlassen() {
		return "bzz bzz... Motor erfolgreich gestartet";		
	}

	@Override
	public String ausschalten() {
		return "bzz bzz... Motor erfolgreich ausgeschalten";		
	}
	
}
