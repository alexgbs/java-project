package auto.ch.moser.controller;

import java.io.InputStream;
import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class AutoZusammenSteller {
	Scanner scanner;
	Pattern pattern;
	public AutoZusammenSteller(InputStream stream) {
		scanner = new Scanner(stream);
		pattern = Pattern.compile("[^ ]*");
		
		commands(scanner.next(pattern), Object.class);
		
	}
	
	public Object commands(String s, Class clazz) {
		Object object = null;
		
		if(object.getClass().equals(clazz)) {
			return object; 
		}
		try {
			throw new IllegalClassFormatException("Falsche Eingabe!!!");
		} catch (IllegalClassFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
