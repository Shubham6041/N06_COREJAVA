package org.tnsif.multithreading;

public class MultiThreading extends Thread{
	public void run()
	{
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		MultiThreading m = new MultiThreading();
		m.start();

	}

}
