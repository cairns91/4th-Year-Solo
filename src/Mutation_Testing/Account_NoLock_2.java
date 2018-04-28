package Mutation_Testing;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import Bank_Coverage_SharedResources.*;

public class Account_NoLock_2 {

	public static double balance;
	public static Lock balanceLock;
	public static Condition enoughFundsCondition;
	public static int accountNumber;

	public Account_NoLock_2(int acc, double bal) {
		Account_NoLock_2.accountNumber = acc;
		Account_NoLock_2.balance = bal;
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

		Bank_Coverage_SharedResources.B_syncLocations.add(Thread.currentThread().getName() + "withdraw");

		if (balance < amount) {
		}
		try {
			while (balance < amount) {
				if (!stillWaiting) {
					Thread.currentThread().interrupt();
				}
				stillWaiting = enoughFundsCondition.await(5, TimeUnit.SECONDS);
			}
			balance = balance - amount;
		} finally {

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
