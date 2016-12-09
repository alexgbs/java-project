package auto.ch.moser;

import auto.ch.moser.controller.AutoZusammenSteller;
import auto.ch.moser.controller.ControllerFactory;

public class MainClass {
	/**
	 * Startet das Programm und die wichtigen Abläufe
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("  /####################################################\\");
		System.out.println(" /###########                              #############\\");
		System.out.println("--###########        AUTOWERKSTATT         ##############--");
		System.out.println(" \\###########                              #############/");
		System.out.println("  \\####################################################/");
		System.out.println();
		ControllerFactory.init();
		AutoZusammenSteller auto1 = new AutoZusammenSteller();
		System.out.println(auto1);
	}

}
