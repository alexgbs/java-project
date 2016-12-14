package auto.ch.moser.model;

/**
 * Objekt Hersteller. Enthält alle Informationen, die der Hersteller haben muss
 * @author Damian
 *
 */

public class Hersteller {
	private String name;
	private String standort;
	
	public Hersteller(String name, String standort) {
		super();
		this.name = name;
		this.standort = standort;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the standort
	 */
	public String getStandort() {
		return standort;
	}

	/**
	 * @param standort the standort to set
	 */
	public void setStandort(String standort) {
		this.standort = standort;
	}


}
