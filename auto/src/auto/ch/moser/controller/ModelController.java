package auto.ch.moser.controller;

import java.lang.reflect.ParameterizedType;
import auto.ch.moser.controller.helpers.CommandHelper;

/**
 * Ist die Hauptklasse aller Controller. Sie enthält einige wichtige Funktionen, die alle Controller beherschen müssen
 * und bei allen gleich ist.
 * @author Damian
 *
 * @param <Model>
 */
public abstract class ModelController<Model> extends CommandHelper{
	
	public ModelController() {
		ControllerFactory.addController(this);
	}
	
	/**
	 * Commandozeilenabfrage, welche bestimmte aktionen auslöst.
	 * @param path Der weg auf dem es sich zur zeit verbindet
	 * @param model model, welches es steuert - editiert
	 * @return true falls änderungen gemacht wurden, sonst false
	 */
	public abstract boolean controll(String path, Model model);
	
	/**
	 * Überprüft, ob der Generify <Model> die selbe Klasse ist, wie die Mitgegebene Klasse
	 * @param clazz Klasse, welche mit dem Generify verglichen wird
	 * @return true wenn gleich, sonst false
	 */
	@SuppressWarnings("unchecked")
	public boolean instanceOf(Class<?> clazz) {
		Class<Model> type = (Class<Model>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		if(clazz.isAssignableFrom(type)) {
			return true;
		}
		return false;
	}
}
