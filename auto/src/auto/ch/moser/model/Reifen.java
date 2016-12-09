package auto.ch.moser.model;

public class Reifen extends Teil {

	float breite;
	String art;
	public Reifen(Hersteller hersteller, float breite, String art) {
		super(hersteller);
		this.breite = breite;
		this.art = art;
	}
	public float getBreite() {
		return breite;
	}
	public void setBreite(float breite) {
		this.breite = breite;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
}
