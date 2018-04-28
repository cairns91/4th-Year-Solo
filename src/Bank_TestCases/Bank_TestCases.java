package Bank_TestCases;

/**
 * @author Greig Cairns
 * 
 *      This class contains the Test cases that came with the Bank System
 *		that represent each Synchronization-pair. For each Test case, the package Bank
 * 		has all the original test drivers. The fields are used in the algorithm to hold the
 * 		value that is generated in the initial iteration by using random.
 *
 */

import Bank.Account;

public class Bank_TestCases {

	public static double test1Amount;
	public static double test1Balance;

	public static double test2Amount;
	public static double test2Balance;

	public static double test3Amount;
	public static double test3Balance;

	public static double test4Amount;
	public static double test4Balance;

	public static double test5Amount;
	public static double test5Balance;

	public void TestDriver1(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);
		test1Amount = amount;
		test1Balance = bal;

		Thread thread1 = new Thread("1 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.deposit(amount);
				account.getBalance();
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("1 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {
				}
				account.deposit(amount);
				account.getBalance();
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

	public void TestDriver2(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);
		test2Amount = amount;
		test2Balance = bal;

		Thread thread1 = new Thread("2 Th1 ") {
			public void run() {
				account.getBalance();
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {
				}
			}
		};

		Thread thread2 = new Thread("2 Th2 ") {
			public void run() {
				account.getBalance();
				account.deposit(amount);
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

	public void TestDriver3(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);
		test3Amount = amount;
		test3Balance = bal;

		Thread thread1 = new Thread("3 Th1 ") {
			public void run() {
				account.deposit(amount);
				account.getBalance();
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("3 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.getBalance();
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

	public void TestDriver4(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);
		test4Amount = amount;
		test4Balance = bal;

		Thread thread1 = new Thread("4 Th1 ") {
			public void run() {
				account.deposit(amount);
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("4 Th2 ") {
			public void run() {
				account.deposit(amount);
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.getBalance();
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

	public void TestDriver5(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);
		test5Amount = amount;
		test5Balance = bal;

		Thread thread1 = new Thread("5 Th1 ") {
			public void run() {
				account.deposit(amount);
				account.deposit(amount);
				account.getBalance();
				account.deposit(amount);
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("5 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.deposit(amount);
				account.getBalance();
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

}
