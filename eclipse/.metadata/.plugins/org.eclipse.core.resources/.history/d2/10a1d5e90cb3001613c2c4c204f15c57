package auto.ch.moser.controller;

import java.io.InputStream;
import java.lang.instrument.IllegalClassFormatException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.Teil;

public class AutoZusammenSteller implements Commandable {
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

	@Override
	public boolean executeCommand() {
		scanner.nextLine();
		// TODO Auto-generated method stub
		return false;
	}
}
