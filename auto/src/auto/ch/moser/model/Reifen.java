package auto.ch.moser.model;

public class Reifen extends Teil {

	float breite;
	String art;
	public Reifen(Hersteller hersteller, float breite, String art) {
		super(hersteller);
		this.breite = breite;
		this.art = art;
	}
	/**
	 * @return the breite
	 */
	public float getBreite() {
		return breite;
	}
	/**
	 * @param breite the breite to set
	 */
	public void setBreite(float breite) {
		this.breite = breite;
	}
	/**
	 * @return the art
	 */
	public String getArt() {
		return art;
	}
	/**
	 * @param art the art to set
	 */
	public void setArt(String art) {
		this.art = art;
	}

}
