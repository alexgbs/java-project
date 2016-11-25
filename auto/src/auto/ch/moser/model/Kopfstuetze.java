package auto.ch.moser.model;

public class Kopfstuetze extends Teil {
	String farbe;

	public Kopfstuetze(Hersteller hersteller, String farbe) {
		super(hersteller);
		this.farbe = farbe;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	@Override
	public boolean executeCommand() {
		// TODO Auto-generated method stub
		return false;
	}
}
