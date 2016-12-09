package auto.ch.moser.controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import auto.ch.moser.controller.helpers.CommandHelper;
import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Hersteller;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class AutoZusammenSteller extends CommandHelper {
	public static final String PATH = "Werkstatt";
	Map<String, Auto>auto = new HashMap<>();
	File file = new File("T:\\aue\\autos.json");
	public AutoZusammenSteller() {
		executeCommand(PATH);
	}
	
	/**
	 * Commandozeilenabfrage, welche bestimmte aktionen auslöst.
	 * @param path Der weg auf dem es sich zur zeit verbindet
	 * @return
	 */
	public boolean executeCommand(String path) {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println(path +":>");
			String[] command = readLine();
			switch(command[0]) {
			case "getAuto":
				if(!testCommandLenght(command)) break;
				Auto a = auto.get(command[1]);
				if(a == null) {
					System.out.println("Dieses Auto existiert nicht!");
					break;
				}
				modified = ControllerFactory.getInstance(Auto.class).controll(path + "\\auto(" + command[1] + ")", a);
				break;
			case "return":
				if(!testCommandLenght(command, 1)) break;
				end = true;
				break;
			case "list":
				for(String s : auto.keySet()) {
					System.out.println(s);
				}
				break;
			case "createAuto": 
				if(!testCommandLenght(command)) break;
				if(auto.get(command[1]) != null) {
					System.out.println("Auto existiert bereits!!");
					break;
				}
				Auto auto1 = new Auto(new Hersteller("Alex und Damian GmbH", "Silicon Valey"),null, null, null,null,null);
				auto.put(command[1], auto1);
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("list");
				System.out.println("getAuto");
				System.out.println("createAuto");
				System.out.println("return");
				break;
				default:
					System.out.println("Komando nicht gefunden!");
					break;
			}
			if(modified) {
				Gson gson = new Gson();
				try {
					gson.toJson(auto, new FileWriter("file"));
				} catch (JsonIOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return modified;
	}
}
