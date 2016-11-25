package auto.ch.moser.model;

public class Hersteller {
	private String name;
	private String standort;
	
	public Hersteller(String name, String standort) {
		super();
		this.name = name;
		this.standort = standort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandort() {
		return standort;
	}

	public void setStandort(String standort) {
		this.standort = standort;
	}
}
