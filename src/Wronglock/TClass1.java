package Wronglock;

/**
 * @author Xuan Created on Apr 27, 2005
 */

public class TClass1 extends Thread {

	Wronglock wl;

	public TClass1(Wronglock wl) {

		this.wl = wl;
	}

	public void run() {

		wl.A();
	}
}
