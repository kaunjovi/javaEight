package org.fun.n.games.javaEight;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLambda {

	private final static Logger logger = LoggerFactory
			.getLogger("org.fun.n.games.javaEight.TestLambda");

	@Test
	public void test() {
		logger.debug("Starting a comprehensive list of tests. He he. Just kidding.");

		final int TEN = 10;

		assertTrue("Simple vanilla addition.", TEN == (5 + 5));

		// int a = b = 5;
		// assertTrue("Basic lambda expression.", TEN == ((a, b) -> (a + b)));

	}

}
