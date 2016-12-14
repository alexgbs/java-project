package auto.ch.moser.model;

/**
 * Objekt Sitz. Enth�lt alle Informationen, die der Sitz haben muss
 * @author Damian
 *
 */
public class Sitz extends Teil {
	String typ;
	boolean hasHeizung;
	boolean hasLehne;
	boolean hasBezug;
	Kopfstuetze kopfst�tze;
	String sitzFarbe;
	String sitzBezugsArt;
	
	public Sitz(Hersteller hersteller, String typ, boolean hasHeizung,
			boolean hasLehne, boolean hasBezug, Kopfstuetze kopfst�tze,
			String sitzFarbe, String sitzBezugsArt) {
		super(hersteller);
		this.typ = typ;
		this.hasHeizung = hasHeizung;
		this.hasLehne = hasLehne;
		this.hasBezug = hasBezug;
		this.kopfst�tze = kopfst�tze;
		this.sitzFarbe = sitzFarbe;
		this.sitzBezugsArt = sitzBezugsArt;
	}

	/**
	 * @return the typ
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * @param typ the typ to set
	 */
	public void setTyp(String typ) {
		this.typ = typ;
	}

	/**
	 * @return the hasHeizung
	 */
	public boolean isHasHeizung() {
		return hasHeizung;
	}

	/**
	 * @param hasHeizung the hasHeizung to set
	 */
	public void setHasHeizung(boolean hasHeizung) {
		this.hasHeizung = hasHeizung;
	}

	/**
	 * @return the hasLehne
	 */
	public boolean isHasLehne() {
		return hasLehne;
	}

	/**
	 * @param hasLehne the hasLehne to set
	 */
	public void setHasLehne(boolean hasLehne) {
		this.hasLehne = hasLehne;
	}

	/**
	 * @return the hasBezug
	 */
	public boolean isHasBezug() {
		return hasBezug;
	}

	/**
	 * @param hasBezug the hasBezug to set
	 */
	public void setHasBezug(boolean hasBezug) {
		this.hasBezug = hasBezug;
	}

	/**
	 * @return the kopfst�tze
	 */
	public Kopfstuetze getKopfst�tze() {
		return kopfst�tze;
	}

	/**
	 * @param kopfst�tze the kopfst�tze to set
	 */
	public void setKopfst�tze(Kopfstuetze kopfst�tze) {
		this.kopfst�tze = kopfst�tze;
	}

	/**
	 * @return the sitzFarbe
	 */
	public String getSitzFarbe() {
		return sitzFarbe;
	}

	/**
	 * @param sitzFarbe the sitzFarbe to set
	 */
	public void setSitzFarbe(String sitzFarbe) {
		this.sitzFarbe = sitzFarbe;
	}

	/**
	 * @return the sitzBezugsArt
	 */
	public String getSitzBezugsArt() {
		return sitzBezugsArt;
	}

	/**
	 * @param sitzBezugsArt the sitzBezugsArt to set
	 */
	public void setSitzBezugsArt(String sitzBezugsArt) {
		this.sitzBezugsArt = sitzBezugsArt;
	}

	
}
