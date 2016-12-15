package auto.ch.moser.model;

import java.util.Map;

/**
 * Objekt Werkstatt. Enthält alle Informationen, die die Werkstatt haben muss
 * @author Damian
 *
 */
public class Werkstatt {
	
	private Map<String, Auto> autos;
	private String name;
	public Werkstatt(Map<String, Auto> autos, String name) {
		super();
		this.autos = autos;
		this.name = name;
	}
	public Map<String, Auto> getAutos() {
		return autos;
	}
	public void setAutos(Map<String, Auto> autos) {
		this.autos = autos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
