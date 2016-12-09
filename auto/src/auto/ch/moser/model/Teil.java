package auto.ch.moser.model;

import auto.ch.moser.controller.helpers.CommandHelper;

public abstract class Teil extends CommandHelper {
	Hersteller hersteller;
	
	protected Teil(Hersteller hersteller) {
		
	}

	/**
	 * @return the hersteller
	 */
	public Hersteller getHersteller() {
		return hersteller;
	}

	/**
	 * @param hersteller the hersteller to set
	 */
	public void setHersteller(Hersteller hersteller) {
		this.hersteller = hersteller;
	}
}
