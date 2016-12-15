package auto.ch.moser.test;

import org.junit.Assert;
import org.junit.Test;

import auto.ch.moser.controller.helpers.CommandHelper;

public class CommandHelperTest {

	@Test
	public void test() {
		CommandHelper helper = new CommandHelper() {};
		Assert.assertTrue(helper.testCommandLenght(new String[] {"S1", "S2"}));
		Assert.assertTrue(helper.testCommandLenght(new String[] {"S1", "S2"}, 2));
		Assert.assertFalse(helper.testCommandLenght(new String[] {"S1", "S2"}, 1));
		Assert.assertTrue(helper.testCommandLenght(new String[] {"S1"}, 1));
	}

}
