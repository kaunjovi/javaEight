package org.fun.n.games.javaEight.lambda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Worker implements Runnable {
	private final static Logger logger = LoggerFactory
			.getLogger("org.fun.n.games.javaEight.lambda.Worker");

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			logger.debug("Do some work");
			// doSomeWork();
		}
	}

}
