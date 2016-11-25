package auto.ch.moser;

import auto.ch.moser.controller.AutoZusammenSteller;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("#################################");
		AutoZusammenSteller auto1 = new AutoZusammenSteller(System.in);
		System.out.println(auto1);
	}

}
