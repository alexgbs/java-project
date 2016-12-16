package auto.ch.moser.test;

import org.junit.Assert;
import org.junit.Test;

import auto.ch.moser.controller.ControllerFactory;
import auto.ch.moser.controller.FelgenController;
import auto.ch.moser.controller.AutoController;
import auto.ch.moser.model.Auto;

public class ControllerFactoryTest {

	@Test
	public void test() {
		ControllerFactory.init();
		Assert.assertEquals(AutoController.class, ControllerFactory.getInstance(Auto.class).getClass());
		Assert.assertNotEquals(FelgenController.class, ControllerFactory.getInstance(Auto.class).getClass());
	}

}
