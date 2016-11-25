package auto.ch.moser.model;

public abstract class Teil implements Commandable {
	Hersteller hersteller;
	
	protected Teil(Hersteller hersteller) {
		
	}
}
