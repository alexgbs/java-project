package auto.ch.moser.model;

/**
 * Objekt Felgen. Enthält alle Informationen, die die Felgen haben mussen
 * @author Damian
 *
 */
public class Felgen extends Teil {
	String farbe;

	public Felgen(Hersteller hersteller, String farbe) {
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
