package com.holddie.java.base;

public class ThreadA extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("这是线程 A ");
	}
}
