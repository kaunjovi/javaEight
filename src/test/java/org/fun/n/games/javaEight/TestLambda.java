package org.fun.n.games.javaEight;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLambda {

	private final static Logger logger = LoggerFactory
			.getLogger("org.fun.n.games.javaEight.TestLambda");

	// This is just a wrapper. We don't know at the moment what is the exact
	// logic in the execute() method.
	interface ILambdaWrapper {
		int execute(int a, int b);
	}

	@Test
	public void test() {
		logger.debug("Starting a comprehensive list of tests. He he. Just kidding.");

		final int TEN = 10;

		assertTrue("Simple vanilla addition.", TEN == (5 + 5));

		// Now we know what needs to be done in the execute() method.
		// But we dont really need a new class and name for that. Just provide
		// the logic.
		ILambdaWrapper add = (a, b) -> (a + b);
		assertTrue("Basic lambda expression.", TEN == add.execute(5, 5));

		ILambdaWrapper subtract = (r, s) -> (r - s);
		assertTrue("Basic lambda expression.", TEN == subtract.execute(15, 5));

	}

}
