package auto.ch.moser.controller;

import auto.ch.moser.model.Auto;
import auto.ch.moser.model.Felgen;
import auto.ch.moser.model.Hersteller;
import auto.ch.moser.model.Reifen;
import auto.ch.moser.model.Sitz;
import auto.ch.moser.model.motor.Elektromotor;
import auto.ch.moser.model.motor.Motor;
import auto.ch.moser.model.motor.Verbrennungsmotor;

public class AutoController extends ModelController<Auto> {

	@Override
	public boolean controll(String path, Auto model) {
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
			case "setKarosserie":
				if(!testCommandLenght(command)) break;
				model.setKarosserieFarbe(command[1]);
				System.out.println("Karosserie erfolgreich auf " + model.getKarosserieFarbe() + " gesetzt");
				break;
			case "getSitz":
				if(!testCommandLenght(command)) break;
				
				Sitz sitz = model.getSitze().get(command[1]);
				if(sitz == null) sitz = new Sitz(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), command[1], false, false, false, null, null, null);
				modified = ControllerFactory.getInstance(Sitz.class).controll(path + "\\sitz(" + command[1] + ")", sitz);
				break;
			case "createSitz":
				if(!testCommandLenght(command)) break;
				if(model.getSitze().get(command[1]) != null) {
					System.out.println("Sitz existiert bereits!!");
					break;
				}
				Sitz sitz1 = new Sitz(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), command[1], false, false, false, null, null, null);
				model.getSitze().put(command[1], sitz1);
				break;
			case "getFelgen":
				if(!testCommandLenght(command, 1)) break;
				if(model.getFelgen() == null) model.setFelgen(new Felgen(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), null));
				modified = ControllerFactory.getInstance(Felgen.class).controll(path + "\\felgen", model.getFelgen());
				break;
			case "getReifen":
				if(!testCommandLenght(command, 1)) break;
				if(model.getReifen() == null) model.setReifen(new Reifen(new Hersteller("Alex und Damian GmbH", "Silicon Valey"), 0, null));
				modified = ControllerFactory.getInstance(Reifen.class).controll(path + "\\reifen", model.getReifen());
				break;
			case "getMotor":
				if(!testCommandLenght(command, 1)) break;
				if(model.getMotor() == null) model.setMotor(new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0));
				if(model.getMotor() instanceof Elektromotor) {
					modified = ControllerFactory.getInstance(Elektromotor.class).controll(path + "\\motor" + "(Elektromotor)", (Elektromotor) model.getMotor());
					break;
				} else if(model.getMotor() instanceof Verbrennungsmotor) {
					modified = ControllerFactory.getInstance(Verbrennungsmotor.class).controll(path + "\\motor" + "(Verbrennungsmotor)", (Verbrennungsmotor) model.getMotor());
					break;
				}
				System.out.println("Motor nicht gefunden");
				break;
			case "getHersteller":
				if(!testCommandLenght(command, 1)) break;
				if(model.getHersteller() == null) model.setHersteller(new Hersteller("Alex und Damian GmbH", "Silicon Valey"));
				modified = ControllerFactory.getInstance(Hersteller.class).controll(path + "\\hersteller", model.getHersteller());
				break;
			case "createMotor":
				if(!testCommandLenght(command)) break;
				if(command[1].equals("Verbrennungsmotor"))
					model.setMotor(new Verbrennungsmotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey"), "Verbrennungsmotor", 0));
				else if(command[1].equals("Dieselmotor"))
					model.setMotor(new Elektromotor(0, new Hersteller("Alex und Damian GmbH", "Silicon Valey")));
				else
					System.out.println("Diesen Motortyp gibt es nicht");
				break;
			case "list":
				if(!testCommandLenght(command, 1)) break;
				list(model);
				break;
			case "commands":
				if(!testCommandLenght(command, 1)) break;
				System.out.println("Alle Commands:");
				System.out.println("setKarosserie");
				System.out.println("getSitz");
				System.out.println("createSitz");
				System.out.println("getFelgen");
				System.out.println("getReifen");
				System.out.println("getMotor");
				System.out.println("setKarosserie");
				System.out.println("getHersteller");
				System.out.println("createMotor");
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
	
	public void list(Auto auto) {
		System.out.println("Autodaten");
		System.out.println("Karosserie: " + auto.getKarosserieFarbe());
		System.out.println("Felgen: " + auto.getFelgen());
		System.out.println("Reifen: " + auto.getReifen());
		auto.getSitze().keySet().forEach(e -> System.out.println("Sitz: " + e));
		System.out.println("Motor: " + auto.getMotor());
	}
}
