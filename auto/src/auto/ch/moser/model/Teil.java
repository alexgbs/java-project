package auto.ch.moser.model;

/**
 * Objekt Teil. Enth�lt alle Informationen, die alle Teile haben m�ssen.
 * @author Damian
 *
 */
public abstract class Teil {
	Hersteller hersteller;
	
	protected Teil(Hersteller hersteller) {
		
	}

	/**
	 * @return the hersteller
	 */
	public Hersteller getHersteller() {
		return hersteller;
	}

	/**
	 * @param hersteller the hersteller to set
	 */
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}
}
