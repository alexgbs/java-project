package auto.ch.moser.model;

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

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public boolean isHasHeizung() {
		return hasHeizung;
	}

	public void setHasHeizung(boolean hasHeizung) {
		this.hasHeizung = hasHeizung;
	}

	public boolean isHasLehne() {
		return hasLehne;
	}

	public void setHasLehne(boolean hasLehne) {
		this.hasLehne = hasLehne;
	}

	public boolean isHasBezug() {
		return hasBezug;
	}

	public void setHasBezug(boolean hasBezug) {
		this.hasBezug = hasBezug;
	}

	public Kopfstuetze getKopfst�tze() {
		return kopfst�tze;
	}

	public void setKopfst�tze(Kopfstuetze kopfst�tze) {
		this.kopfst�tze = kopfst�tze;
	}

	public String getSitzFarbe() {
		return sitzFarbe;
	}

	public void setSitzFarbe(String sitzFarbe) {
		this.sitzFarbe = sitzFarbe;
	}

	public String getSitzBezugsArt() {
		return sitzBezugsArt;
	}

	public void setSitzBezugsArt(String sitzBezugsArt) {
		this.sitzBezugsArt = sitzBezugsArt;
	}
}
