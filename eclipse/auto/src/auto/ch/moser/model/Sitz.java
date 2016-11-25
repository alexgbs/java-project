package auto.ch.moser.model;

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

	public Kopfstuetze getKopfstütze() {
		return kopfstütze;
	}

	public void setKopfstütze(Kopfstuetze kopfstütze) {
		this.kopfstütze = kopfstütze;
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

	@Override
	public boolean executeCommand() {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println("Werkstatt:>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Sitzdaten");
					System.out.println("String: " + typ);
					System.out.println("boolean: " + hasHeizung);
					System.out.println("boolean: " + hasLehne);
					System.out.println("boolean: " + hasBezug);
					System.out.println("Kopfstuetze: " + kopfstütze);
					System.out.println("String: " + sitzFarbe);
					System.out.println("String: " + sitzBezugsArt);
				case "setTyp":
					typ = command[1];
					System.out.println("");
				case "return":
					if (!testCommandLenght(command,1)) break;
					end = true;
					break;
				default:
					System.out.println("Komando nicht gefunden!");
			}
		}
		return modified;
	}

}
