package auto.ch.moser;

import auto.ch.moser.model.Werkstatt;

import java.util.HashMap;

import auto.ch.moser.controller.ControllerFactory;

/**
 * Das ist die Mainmethode. Von hier aus startet das ganze Programm
 * @author Damian
 *
 */
public class MainClass {
	/**
	 * Startet das Programm und die wichtigen Abläufe
	 * @param args
	 */
	public final static Werkstatt WERKSTATT = new Werkstatt(new HashMap<>(), "Alex und Damian's Werkstatt");
	public static void main(String[] args) {
		System.out.println("  /####################################################\\");
		System.out.println(" /###########                              #############\\");
		System.out.println("--###########        AUTOWERKSTATT         ##############--");
		System.out.println(" \\###########                              #############/");
		System.out.println("  \\####################################################/");
		System.out.println();
		ControllerFactory.init();
		ControllerFactory.getInstance(Werkstatt.class).controll("", WERKSTATT);
	}

}
