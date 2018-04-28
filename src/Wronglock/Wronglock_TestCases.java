package Wronglock;

/**
 * @author Greig Cairns
 * 
 *         This class contains the Test cases that represent each
 *         Synchronization-pair, for Wronglock
 *
 */

public class Wronglock_TestCases {
	
	// Pair: <2a,4a> (A,B)
	public void Test1(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("1 Th1 ") {
			public void run() {
				lock.A();
				lock.B();
			}
		};

		Thread thread2 = new Thread("1 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,2b> (A,A)
	public void Test2(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("2 Th1 ") {
			public void run() {
				lock.A();
			}
		};

		Thread thread2 = new Thread("2 Th2 ") {
			public void run() {
				lock.A();
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,4b> (A,B)
	public void Test3(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("3 Th1 ") {
			public void run() {
				lock.A();
			}
		};

		Thread thread2 = new Thread("3 Th2 ") {
			public void run() {
				lock.B();
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,2a> (B,A)
	public void Test4(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("4 Th1 ") {
			public void run() {
				lock.B();
				lock.A();
			}
		};

		Thread thread2 = new Thread("4 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,2b> (B,A)
	public void Test5(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("5 Th1 ") {
			public void run() {
				lock.B();
			}
		};

		Thread thread2 = new Thread("5 Th2 ") {
			public void run() {
				lock.A();
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,4b> (B,B)
	public void Test6(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("6 Th1 ") {
			public void run() {
				lock.B();
			}
		};

		Thread thread2 = new Thread("6 Th2 ") {
			public void run() {
				lock.B();
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,4b> (A,B)
	public void Test7(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("7 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("7 Th2 ") {
			public void run() {
				lock.A();
				lock.B();
			}
		};
		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,2a> (A,A)
	public void Test8(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("8 Th1 ") {
			public void run() {
				lock.A();
			}
		};

		Thread thread2 = new Thread("8 Th2 ") {
			public void run() {
				lock.A();
			}
		};
		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,4a> (A,B)
	public void Test9(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("9 Th1 ") {
			public void run() {
				lock.B();
			}
		};

		Thread thread2 = new Thread("9 Th2 ") {
			public void run() {
				lock.A();
			}
		};
		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,2b> (B,A)
	public void Test10(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("10 Th1 ") {
			public void run() {
				lock.B();
				lock.A();
			}
		};

		Thread thread2 = new Thread("10 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,2a> (B,A)
	public void Test11(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("11 Th1 ") {
			public void run() {
				lock.A();
			}
		};

		Thread thread2 = new Thread("11 Th2 ") {
			public void run() {
				lock.B();
			}
		};
		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,4a> (B,B)
	public void Test12(Data d) {
		Wronglock lock = new Wronglock(d);

		Thread thread1 = new Thread("12 Th1 ") {
			public void run() {
				lock.B();
			}
		};

		Thread thread2 = new Thread("12 Th2 ") {
			public void run() {
				lock.B();
			}
		};
		try {
			thread2.start();
			thread1.start();
			thread1.join();
			thread2.join();
		} catch (Exception e) {
		}
	}
}
