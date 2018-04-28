package Wronglock;

/**
 * @author Xuan Created on 2005-1-18
 * 
 *         This class simulates the wrong lock bug Method A requests a lock on
 *         data while method B request a lock on the class.
 */

/**
 * 
 * @author Greig Cairns
 * 
 *         Code additons made to to CUT Line 27 and Line 39
 * 
 *         Used to help make a sync location to be stored in the ArrayList.
 *
 */

public class Wronglock {
	Data data;

	public Wronglock(Data data) {
		this.data = data;
	}

	public void A() {
		synchronized (data) {
			Wronglock_SharedResources.W_syncLocations.add(Thread.currentThread().getName() + "A");
			int x = data.value;
			data.value++;
			assert (data.value == x + 1);
			if (data.value != (x + 1))
				throw new RuntimeException("bug found");
		}
	}

	public void B() {
		synchronized (this) {
			Wronglock_SharedResources.W_syncLocations.add(Thread.currentThread().getName() + "B");
			data.value++;
		}
	}
}
