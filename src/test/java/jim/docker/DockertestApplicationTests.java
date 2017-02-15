package jim.docker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class DockertestApplicationTests {

	@Test
	public void firstTest() {
		final int result = 2;
		int addition = 1+1;
		Assert.assertThat(result, is(addition));
	}

}
