package Mutation_Testing;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import Bank_Coverage_SharedResources.*;
import Not_Used.Bank_Coverage_MyTests;

public class Account_wronglock_3 {

	public static double balance;
	public static Lock balanceLock;
	public static Lock wronglock;
	public static Condition enoughFundsCondition;
	public static int accountNumber;

	public Account_wronglock_3(int acc, double bal) {
		Account_wronglock_3.accountNumber = acc;
		Account_wronglock_3.balance = bal;
		balanceLock = new ReentrantLock();
		wronglock = new ReentrantLock();
		enoughFundsCondition = balanceLock.newCondition();
	}

	public void getBalance() {
		balanceLock.lock();

		System.out.println("BalanceLock getBalance" + balanceLock);

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

		System.out.println("BalanceLock Withdraw" + balanceLock);

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
		wronglock.lock();

		System.out.println("BalanceLock deposit" + wronglock);

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
			wronglock.unlock();
		}
	}
}
