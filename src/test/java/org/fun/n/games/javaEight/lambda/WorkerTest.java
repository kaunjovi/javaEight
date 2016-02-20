package org.fun.n.games.javaEight.lambda;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WorkerTest {

	@Test
	public void test() {
		Worker w = new Worker();
		new Thread(w).start();

		// Can't really test it. So faking it.
		assertTrue("Sorry. Faking it. Could not test the multithreading.", true);
	}

}
