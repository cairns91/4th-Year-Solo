package Deadlock;

import Deadlock.Client;

/**
 * @author Greig Cairns
 * 
 *         This class contains the Test cases that represent each
 *         Synchronization-pair, for Deadlock
 *
 */

public class Deadlock_TestCases {

	// Pair: <2a,2b> (lock1,lock1)
	public void Test1(Object lock1, Object lock2) {

		lock1 = "lock1";
		lock2 = "lock2";

		Client thread1 = new Client(lock1, lock1);
		Client thread2 = new Client(lock1, lock1);

		thread1.setName("1 Th1 ");
		thread2.setName("1 Th2 ");

		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Deadlock_SharedResources.D_syncLocations.remove("1 Th1 lock2");
		Deadlock_SharedResources.D_syncLocations.remove("1 Th2 lock2");
	}

	// Pair: <4a,4b> (lock2,lock2)
	public void Test2(Object lock1, Object lock2) {

		lock1 = "lock1";
		lock2 = "lock2";

		Client thread1 = new Client(lock2, lock2);
		Client thread2 = new Client(lock2, lock2);

		thread1.setName("2 Th1 ");
		thread2.setName("2 Th2 ");

		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Deadlock_SharedResources.D_syncLocations.remove("2 Th1 lock1");
		Deadlock_SharedResources.D_syncLocations.remove("2 Th2 lock1");
	}

	// Pair: <2b,2a> (lock1,lock1)
	public void Test3(Object lock1, Object lock2) {

		lock1 = "lock1";
		lock2 = "lock2";

		Client thread2 = new Client(lock1, lock1);
		Client thread1 = new Client(lock1, lock1);

		thread1.setName("3 Th1 ");
		thread2.setName("3 Th2 ");

		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Deadlock_SharedResources.D_syncLocations.remove("3 Th1 lock2");
		Deadlock_SharedResources.D_syncLocations.remove("3 Th2 lock2");
	}

	// Pair: <4b,4a> (lock2,lock2)
	public void Test4(Object lock1, Object lock2) {

		lock1 = "lock1";
		lock2 = "lock2";

		Client thread2 = new Client(lock2, lock2);
		Client thread1 = new Client(lock2, lock2);

		thread1.setName("4 Th1 ");
		thread2.setName("4 Th2 ");

		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Deadlock_SharedResources.D_syncLocations.remove("4 Th1 lock1");
		Deadlock_SharedResources.D_syncLocations.remove("4 Th2 lock1");
	}
}