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
	public boolean executeCommand(String path) {
		boolean end = false;
		boolean modified = false;
		
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Sitzdaten");
					System.out.println("Typ: " + typ);
					System.out.println("hat Heizung: " + hasHeizung);
					System.out.println("hat Lehne: " + hasLehne);
					System.out.println("hat Bezug: " + hasBezug);
					System.out.println("Kopfstuetze: " + kopfstütze);
					System.out.println("Sitzfarbe: " + sitzFarbe);
					System.out.println("Sitzbezug: " + sitzBezugsArt);
					break;
				case "setTyp":
					if (!testCommandLenght(command)) break;
					typ = command[1];
					System.out.println("Typ erfolgreich auf " + typ + "gesetzt");
					break;
				case "setHasHeizung":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") hasHeizung = true;
					if (command[1] == "false") hasHeizung = false;
					break;
				case "setHasLehne":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") hasLehne = true;
					if (command[1] == "false") hasLehne = false;
					break;
				case "setHasBezug":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") hasBezug = true;
					if (command[1] == "false") hasBezug = false;
					break;
				case "getKopfstütze":
					if (!testCommandLenght(command,1)) break;
					if (kopfstütze != null) kopfstütze = new Kopfstuetze(new Hersteller("Alex und Daman GmbH", "Silicon Valey"), null);
					modified = kopfstütze.executeCommand(path + "\\kopfstütze");
					break;
				case "setSitzFarbe":
					if (!testCommandLenght(command)) break;
					sitzFarbe = command[1];
					System.out.println("Sitz Farbe erflogreich auf " + sitzFarbe + " gesetzt");
					break;
				case "setSitzBezugsArt":
					if (!testCommandLenght(command)) break;
					sitzBezugsArt = command[1];
					System.out.println("Sitz Bezugs Art erfolgreich auf " + sitzBezugsArt + " gesetzt");
					break;
				case "return":
					if (!testCommandLenght(command,1)) break;
					end = true;
					break;
				default:
					System.out.println("Komando nicht gefunden!");
					break;
			}
		}
		return modified;
	}

}
