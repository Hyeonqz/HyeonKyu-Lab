package org.hyeonqz.javalab.synchronization;

import java.util.logging.Logger;

public class MutexLock {
	public static final Logger LOGGER = Logger.getLogger(MutexLock.class.getName());
	public static void main (String[] args) {

		Thread thread = new Thread(() -> {

		});

		LOGGER.info("쓰레드 이름 : " + thread.getName());
		LOGGER.info("쓰레드 ID : " + thread.threadId());
		thread.start();

	}
}