package auto.ch.moser.model.motor;

public interface MotorSteuern {

	/**
	 * Lässt den Motor an
	 * @return sound des motors beim ausschalten
	 */
	public String anlassen();
	
	/**
	 * Schaltet den Motor ab
	 * @return sound des motors beim einschalten
	 */
	public String ausschalten();
	
}
