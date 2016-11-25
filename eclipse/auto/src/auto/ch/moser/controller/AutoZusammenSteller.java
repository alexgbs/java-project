package auto.ch.moser.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.helpers.CommandHelper;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class AutoZusammenSteller extends CommandHelper implements Commandable {
	Map<String, Auto>auto;
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
		executeCommand();
	}

	@Override
	public boolean executeCommand() {
		boolean end = false;
		boolean modified = false;
		while(!end) {
			System.out.println("Werkstatt:>");
			String[] command = readLine();
			switch(command[0]) {
			case "getAuto":
				Auto a = auto.get(command[1]);
				if(a == null) {
					System.out.println("Dieses Auto existiert nicht!");
					break;
				}
				modified = a.executeCommand();
				break;
			case "end":
				end = true;
				break;
			case "listAll":
				break;
			case "createAuto": 
				
				
				default:
					
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
