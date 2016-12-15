package auto.ch.moser.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.Werkstatt;

/**
 * Controller für {@link Werkstatt} für die Benutzung in der Commandozeile. Das
 * ist der unterste Controller, welcher auch von der Main aufgerufen wird.
 * 
 * @author moser.damian
 *
 */

public class WerkstattController extends ModelController<Werkstatt> {
	/**
	 * Commandozeilenabfrage, welche bestimmte aktionen auslöst.
	 * 
	 * @param path
	 *            Der weg auf dem es sich zur zeit verbindet
	 * @return
	 */

	@Override
	public boolean controll(String path, Werkstatt model) {
		boolean end = false;
		boolean modified = false;
		while (!end) {
			System.out.println(path + " (" + model.getName() + "):>");
			String[] command = readLine();
			switch (command[0]) {
			case "getAuto":
				if (!testCommandLenght(command))
					break;
				Auto a = model.getAutos().get(command[1]);
				if (a == null) {
					System.out.println("Dieses Auto existiert nicht!");
					break;
				}
				modified = ControllerFactory.getInstance(Auto.class).controll(path + "\\auto(" + command[1] + ")", a);
				break;
			case "return":
				if (!testCommandLenght(command, 1))
					break;
				end = true;
				break;
			case "list":
				for (String s : model.getAutos().keySet()) {
					System.out.println(s);
				}
				break;
			case "createAuto":
				if (!testCommandLenght(command))
					break;
				if (model.getAutos().get(command[1]) != null) {
					System.out.println("Auto existiert bereits!!");
					break;
				}
				Auto auto1 = new Auto(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), null, null, null, null,
						null);
				model.getAutos().put(command[1], auto1);
				break;
			case "sort":
				List<Auto> list = new ArrayList(model.getAutos().values());
				Collections.sort(list);
				HashMap<String, Auto> autos = new HashMap<>();
				list.forEach(autoInLambda -> {
					autos.put(model.getAutos().entrySet().stream()
							.filter(entry -> Objects.equals(entry.getValue(), autoInLambda)).map(Map.Entry::getKey)
							.findFirst().get(), autoInLambda);
				});
				model.setAutos(autos);
				break;
			case "commands":
				if (!testCommandLenght(command, 1))
					break;
				System.out.println("Alle Commands:");
				System.out.println("list");
				System.out.println("getAuto");
				System.out.println("createAuto");
				System.out.println("sort");
				System.out.println("return");
				break;
			default:
				System.out.println("Komando nicht gefunden!");
				break;
			}
			if (modified) {
				// possible Savecode
			}
		}
		return modified;
	}
}
