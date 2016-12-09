package auto.ch.moser.controller;

import java.util.ArrayList;

public class ControllerFactory {
	private static ArrayList<ModelController> controllers = new ArrayList();
	public static <T> ModelController<T> getInstance(Class<T> clazz) {
		for(ModelController controller : controllers) {
			if(controller.instanceOf(clazz)) {
				return controller;
			}
		}
		return null;
	}
	public static void addController(ModelController controller) {
		controllers.add(controller);
	}
	
	public static void init() {
		new AutoController();
		new ElektromotorController();
		new FelgenController();
		new HerstellerController();
		new KopfstuetzeController();
		new ReifenController();
		new SitzController();
		new VerbrennungsmotorController();
	}
}
