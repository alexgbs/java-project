package auto.ch.moser.model;

public class Kopfstuetze extends Teil {
	String farbe;

	public Kopfstuetze(Hersteller hersteller, String farbe) {
		super(hersteller);
		this.farbe = farbe;
	}

	/**
	 * @return the farbe
	 */
	public String getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe the farbe to set
	 */
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}


}
