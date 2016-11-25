package auto.ch.moser.controller;

import java.io.InputStream;
import java.lang.instrument.IllegalClassFormatException;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Commandable;
import auto.ch.moser.model.Teil;
import auto.ch.moser.model.helpers.ScannerHelper;

public class AutoZusammenSteller extends ScannerHelper implements Commandable {
	Scanner scanner;
	Pattern pattern;
	Map<String, Auto>auto;
	public AutoZusammenSteller(InputStream stream) {
		scanner = new Scanner(stream);
		pattern = Pattern.compile("([^ ]*)");
		String s = scanner.next(pattern);
				
	}

	@Override
	public boolean executeCommand() {
		boolean end = false;
		while(!end) {
			String[] command = readLine();
			switch(comman[0]) {
			case "getAuto":
				Auto a = auto.get(command[1]);
				if(a == null) {
					break;
				}
				a.executeCommand();
			case "end":
				
			case "listAll":
				
				default:
					
			}
		}
	}
}
