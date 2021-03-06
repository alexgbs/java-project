package auto.ch.moser.controller;

import java.util.ArrayList;

/**
 * Diese Factory h�lt alle jemals erstellten Controller intern fest. Falls ein Controller ben�tigt wird, kann dieser
 * Mit der Funktion getInstance geholt werden.
 * @author Damian
 *
 */

public class ControllerFactory {
	private static ArrayList<ModelController<?>> controllers = new ArrayList<ModelController<?>>();
	
	/**
	 * 
	 * @param clazz Klasse der controller "kontrolliert"
	 * @return den dazugeh�rigen Controller
	 */
	@SuppressWarnings("unchecked")
	public static <T> ModelController<T> getInstance(Class<T> clazz) {
		for(ModelController<?> controller : controllers) {
			if(controller.instanceOf(clazz)) {
				return (ModelController<T>) controller;
			}
		}
		return null;
	}
	/**
	 * F�gt controller der ControllerFactory hinzu
	 * @param controller Controller der hinzugef�get wird
	 */
	public static void addController(ModelController<?> controller) {
		controllers.add(controller);
	}
	/**
	 * Initialisiert alle Controllers, damit sie bei Bedarf aufgerufen werden k�nnen
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
		new WerkstattController();
	}
}
