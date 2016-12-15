package auto.ch.moser.test;

import org.junit.Assert;
import org.junit.Test;

import auto.ch.moser.controller.AutoController;
import auto.ch.moser.controller.FelgenController;
import auto.ch.moser.controller.ModelController;
import auto.ch.moser.model.Auto;

public class ModelControllerTest {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testInstanceof() {
		ModelController controllerAuto = new AutoController();
		Assert.assertTrue(controllerAuto.instanceOf(Auto.class));
		ModelController controllerFelge = new FelgenController();
		Assert.assertFalse(controllerFelge.instanceOf(Auto.class));
	}

}
