package auto.ch.moser.model;

import auto.ch.moser.model.helpers.CommandHelper;

public abstract class Teil extends CommandHelper {
	Hersteller hersteller;
	
	protected Teil(Hersteller hersteller) {
		
	}
}
