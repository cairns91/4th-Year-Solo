package Bank;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import Bank_Coverage_SharedResources.*;

/**
 * 
 * @author Greig Cairns
 * 
 *         Code additons made to to CUT Line 36, Line 50 and Line 76
 * 
 *         Used to help make a sync location to be stored in the ArrayList.
 *
 */

public class Account {

	public static double balance;
	public static Lock balanceLock;
	public static Condition enoughFundsCondition;
	public static int accountNumber;

	public Account(int acc, double bal) {
		Account.accountNumber = acc;
		Account.balance = bal;
		balanceLock = new ReentrantLock();
		enoughFundsCondition = balanceLock.newCondition();
	}

	public void getBalance() {
		balanceLock.lock();

		Bank_Coverage_SharedResources.B_syncLocations.add(Thread.currentThread().getName() + "getBalance");

		try {
			// System.out.println("Thread: " + Thread.currentThread().getName() + " getting
			// Balance...Balance �" + balance);
		} finally {
			balanceLock.unlock();
		}
	}

	public void withdraw(double amount) throws InterruptedException {
		boolean stillWaiting = true;
		balanceLock.lock();

		Bank_Coverage_SharedResources.B_syncLocations.add(Thread.currentThread().getName() + "withdraw");

		if (balance < amount) {
			// System.out.println("Thread: " + Thread.currentThread().getName() + " Not
			// enough money...waiting for deposit");
		}
		try {
			while (balance < amount) {
				if (!stillWaiting) {
					Thread.currentThread().interrupt();
				}
				stillWaiting = enoughFundsCondition.await(5, TimeUnit.SECONDS);
			}
			// System.out.println("Thread: " + Thread.currentThread().getName() + " Withdraw
			// Amount � " + amount);
			balance = balance - amount;
			// System.out.println("Thread: " + Thread.currentThread().getName() + " New
			// balance � " + balance);
		} finally {
			balanceLock.unlock();
		}
	}

	public void deposit(double amount) {
		balanceLock.lock();

		Bank_Coverage_SharedResources.B_syncLocations.add(Thread.currentThread().getName() + "deposit");

		try {
			if (amount > 0) {
				// System.out.println("Thread with ID " + Thread.currentThread().getId() +
				// "Deposit amount �" + amount);
				balance = balance + amount;
			}
			// System.out.println("Thread with ID " + Thread.currentThread().getId() + " New
			// balance �" + balance);
			enoughFundsCondition.signalAll();
		} finally {
			balanceLock.unlock();
		}
	}
}
