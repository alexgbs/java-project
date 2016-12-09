package auto.ch.moser.controller;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import auto.ch.moser.model.helpers.CommandHelper;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

public abstract class ModelController<Model> extends CommandHelper{
	
	public ModelController() {
		ControllerFactory.addController(this);
	}
	public abstract boolean controll(String path, Model model);
	
	public boolean instanceOf(Class clazz) {
		Class<Model> type = (Class<Model>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		if(clazz.isAssignableFrom(type)) {
			return true;
		}
		return false;
	}
}
