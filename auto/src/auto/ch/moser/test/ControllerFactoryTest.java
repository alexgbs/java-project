package auto.ch.moser.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import auto.ch.moser.controller.ControllerFactory;
import auto.ch.moser.controller.FelgenController;
import auto.ch.moser.controller.AutoController;
import auto.ch.moser.model.Auto;

public class ControllerFactoryTest {

	@Test
	public void test() {
		ControllerFactory factory = new ControllerFactory();
		factory.init();
		Assert.assertEquals(AutoController.class, factory.getInstance(Auto.class).getClass());
		Assert.assertNotEquals(FelgenController.class, factory.getInstance(Auto.class).getClass());
	}

}
