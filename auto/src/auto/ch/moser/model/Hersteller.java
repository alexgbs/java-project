package auto.ch.moser.model;

import auto.ch.moser.model.helpers.CommandHelper;

public class Hersteller extends CommandHelper implements Commandable{
	private String name;
	private String standort;
	
	public Hersteller(String name, String standort) {
		super();
		this.name = name;
		this.standort = standort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
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
			case "setName":
				if(!testCommandLenght(command)) break;
				name = command[1];
				System.out.println("Name erfolgreich auf " + name + " gesetzt");
				break;
			case "setStandort":
				if(!testCommandLenght(command)) break;
				standort = command[1];
				System.out.println("Standort erfolgreich auf " + standort + " gesetzt");
				modified = true;
				break;
			case "list": 
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Herstellerdaten:");
				System.out.println("Name: " + name);
				System.out.println("Standort: " + standort);
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setName");
				System.out.println("setStandort");
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
