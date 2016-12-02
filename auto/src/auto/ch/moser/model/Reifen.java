package auto.ch.moser.model;

public class Reifen extends Teil {

	float breite;
	String art;
	public Reifen(Hersteller hersteller, float breite, String art) {
		super(hersteller);
		breite = breite;
		art = art;
	}
	public float getBreite() {
		return breite;
	}
	public void setBreite(float breite) {
		breite = breite;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		art = art;
	}
	@Override
	public boolean executeCommand(String path) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
			case "return":
				if(!testCommandLenght(command, 1)) break;
				end = true;
				break;
			case "setBreite":
				if(!testCommandLenght(command)) break;
				breite = Float.parseFloat(command[1]);
				System.out.println("Breite erfolgreich auf " + breite + " gesetzt");
				break;
			case "setArt":
				if(!testCommandLenght(command)) break;
				art = command[1];
				System.out.println("Art erfolgreich auf " + art + " gesetzt");
				modified = true;
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Herstellerdaten:");
				System.out.println("Breite: " + breite);
				System.out.println("Art: " + art);
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setBreite");
				System.out.println("SetArt");
				System.out.println("list");
				System.out.println("return");
				break;
				default:
					System.out.println("Komando nicht gefunden!");
					break;
			}
		}
		return modified;
	}
}
