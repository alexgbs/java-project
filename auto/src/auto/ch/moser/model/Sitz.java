package auto.ch.moser.model;

/**
 * Objekt Sitz. Enthält alle Informationen, die der Sitz haben muss
 * @author Damian
 *
 */
public class Sitz extends Teil {
	String typ;
	boolean hasHeizung;
	boolean hasLehne;
	boolean hasBezug;
	Kopfstuetze kopfstütze;
	String sitzFarbe;
	String sitzBezugsArt;
	
	public Sitz(Hersteller hersteller, String typ, boolean hasHeizung,
			boolean hasLehne, boolean hasBezug, Kopfstuetze kopfstütze,
			String sitzFarbe, String sitzBezugsArt) {
		super(hersteller);
		this.typ = typ;
		this.hasHeizung = hasHeizung;
		this.hasLehne = hasLehne;
		this.hasBezug = hasBezug;
		this.kopfstütze = kopfstütze;
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
	 * @return the kopfstütze
	 */
	public Kopfstuetze getKopfstütze() {
		return kopfstütze;
	}

	/**
	 * @param kopfstütze the kopfstütze to set
	 */
	public void setKopfstütze(Kopfstuetze kopfstütze) {
		this.kopfstütze = kopfstütze;
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
