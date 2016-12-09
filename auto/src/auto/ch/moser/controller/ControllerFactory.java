package auto.ch.moser.controller;

import java.util.ArrayList;

public class ControllerFactory {
	private static ArrayList<ModelController> controllers = new ArrayList();
	
	/**
	 * 
	 * @param clazz Klasse der controller "kontrolliert"
	 * @return den dazugehörigen Controller
	 */
	public static <T> ModelController<T> getInstance(Class<T> clazz) {
		for(ModelController controller : controllers) {
			if(controller.instanceOf(clazz)) {
				return controller;
			}
		}
		return null;
	}
	/**
	 * Fügt controller der ControllerFactory hinzu
	 * @param controller Controller der hinzugefüget wird
	 */
	public static void addController(ModelController controller) {
		controllers.add(controller);
	}
	/**
	 * Initialisiert alle Controllers, damit sie bei Bedarf aufgerufen werden können
	 */
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
