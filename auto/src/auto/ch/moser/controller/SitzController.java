package auto.ch.moser.controller;

import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.Kopfstuetze;
import auto.ch.moser.model.Sitz;

public class SitzController extends ModelController<Sitz> {

	@Override
	public boolean controll(String path, Sitz model) {
		boolean end = false;
		boolean modified = false;
		
		while(!end) {
			System.out.println(path + ":>");
			String[] command = readLine();
			switch(command[0]) {
				case "list":
					if (!testCommandLenght(command,1)) break;
					System.out.println("Sitzdaten");
					System.out.println("Typ: " + model.getTyp());
					System.out.println("hat Heizung: " + model.isHasHeizung());
					System.out.println("hat Lehne: " + model.isHasLehne());
					System.out.println("hat Bezug: " + model.isHasBezug());
					System.out.println("Kopfstuetze: " + model.getKopfstütze());
					System.out.println("Sitzfarbe: " + model.getSitzFarbe());
					System.out.println("Sitzbezug: " + model.getSitzBezugsArt());
					break;
				case "setTyp":
					if (!testCommandLenght(command)) break;
					model.setTyp(command[1]);
					System.out.println("Typ erfolgreich auf " + model.getTyp() + "gesetzt");
					break;
				case "setHasHeizung":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") model.setHasHeizung(true);
					if (command[1] == "false") model.setHasHeizung(false);
					break;
				case "setHasLehne":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") model.setHasLehne(true);
					if (command[1] == "false") model.setHasLehne(false);
					break;
				case "setHasBezug":
					if (!testCommandLenght(command)) break;
					if (command[1] == "true") model.setHasBezug(true);
					if (command[1] == "false") model.setHasBezug(false);
					break;
				case "getKopfstütze":
					if (!testCommandLenght(command,1)) break;
					if (model.getKopfstütze() != null) model.setKopfstütze(new Kopfstuetze(new Hersteller("Alex und Daman GmbH", "Silicon Valey"), null));
					modified = ControllerFactory.getInstance(Kopfstuetze.class).controll(path + "\\kopfstütze", model.getKopfstütze());
					break;
				case "setSitzFarbe":
					if (!testCommandLenght(command)) break;
					model.setSitzFarbe(command[1]);
					System.out.println("Sitz Farbe erflogreich auf " + model.getSitzFarbe() + " gesetzt");
					break;
				case "setSitzBezugsArt":
					if (!testCommandLenght(command)) break;
					model.setSitzBezugsArt(command[1]);
					System.out.println("Sitz Bezugs Art erfolgreich auf " + model.getSitzBezugsArt() + " gesetzt");
					break;
				case "commands":
					if(!testCommandLenght(command, 1)) break;
					System.out.println("Alle Commands:");
					System.out.println("setTyp");
					System.out.println("setHasHeizung");
					System.out.println("setHasLehne");
					System.out.println("setHasBezug");
					System.out.println("setKopfstütze");
					System.out.println("setSitzFarbe");
					System.out.println("setSitzBezugsArt");
					System.out.println("list");
					System.out.println("return");
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
