package auto.ch.moser.controller;

import java.io.InputStream;
import java.lang.instrument.IllegalClassFormatException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Teil;

public class AutoZusammenSteller {
	Scanner scanner;
	Pattern pattern;
	Map<String, Auto>auto;
	public AutoZusammenSteller(InputStream stream) {
		scanner = new Scanner(stream);
		pattern = Pattern.compile("([^ ]*)");
		String s = scanner.next(pattern);
		if(scanner.hasNext(pattern)) {
			commands(s);
		}		
	}
	
	public Object commands(String s) {
		Object object = null;
		switch(s) {
		case "De alex het en chliine": break;
			default:
				System.out.println("ERROR");
		}
		return null;
	}
}
