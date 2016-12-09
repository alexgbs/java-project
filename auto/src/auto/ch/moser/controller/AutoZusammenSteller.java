package auto.ch.moser.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.Reifen;
import auto.ch.moser.model.Sitz;
import auto.ch.moser.model.helpers.CommandHelper;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class AutoZusammenSteller extends CommandHelper implements Commandable {
	Map<String, Auto>auto = new HashMap<>();
	File file = new File("T:\\aue\\autos.json");
	public AutoZusammenSteller(InputStream stream) {
		/*Gson gson = new Gson();
		Type type = new TypeToken<Map<String, Auto>>() {}.getType();
		try {
			auto = gson.fromJson(new FileReader(file), type);
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		executeCommand("Werkstatt");
	}

	@Override
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
