package auto.ch.moser.controller;

import java.lang.reflect.ParameterizedType;
import auto.ch.moser.controller.helpers.CommandHelper;

public abstract class ModelController<Model> extends CommandHelper{
	
	public ModelController() {
		ControllerFactory.addController(this);
	}
	
	/**
	 * Commandozeilenabfrage, welche bestimmte aktionen auslöst.
	 * @param path Der weg auf dem es sich zur zeit verbindet
	 * @param model model, welches es steuert - editiert
	 * @return
	 */
	public abstract boolean controll(String path, Model model);
	
	public boolean instanceOf(Class clazz) {
		Class<Model> type = (Class<Model>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		if(clazz.isAssignableFrom(type)) {
			return true;
		}
		return false;
	}
}
