package Wronglock;

/**
 * @author Xuan Created on Apr 27, 2005
 */
public class TClass2 extends Thread {

	Wronglock wl;

	public TClass2(Wronglock wl) {

		this.wl = wl;
	}

	public void run() {

		wl.B();
	}
}
