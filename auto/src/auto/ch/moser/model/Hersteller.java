package auto.ch.moser.model;

import auto.ch.moser.controller.helpers.CommandHelper;

public class Hersteller extends CommandHelper {
	private String name;
	private String standort;
	
	public Hersteller(String name, String standort) {
		super();
		this.name = name;
		this.standort = standort;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the standort
	 */
	public String getStandort() {
		return standort;
	}

	/**
	 * @param standort the standort to set
	 */
	public void setStandort(String standort) {
		this.standort = standort;
	}


}
