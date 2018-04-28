package Bank;

import Bank.*;

public class TestDriver5 {

	public static void main(String[] args) {
		// Create account.
		Account A = new Account(123, 0.0);
		// X tries to deposit into account A. Total = 300.
		Thread Xd1 = new Thread(new DepositRunnable(A, 300.00));
		// X tries to deposit into account A. Total = 200.
		Thread Xd1_1 = new Thread(new DepositRunnable(A, 200.00));
		// Y tries to withdraw from account A, Total = 400.
		Thread Yw1 = new Thread(new WithdrawRunnable(A, 400.00));
		// Y tries to deposit into account A. Total = 200.
		Thread Yd1 = new Thread(new DepositRunnable(A, 200.00));
		// Both X and Y wish to view the balance.
		Thread Xb1 = new Thread(new BalanceRunnable(A));
		Thread Yb1 = new Thread(new BalanceRunnable(A));
		// X tries to deposit into account A. Total = 100.
		Thread Xd1_2 = new Thread(new DepositRunnable(A, 100.00));
		// Account holder X transfers money from account A to Account B.
		Thread Tsi = new Thread(new DepositRunnable(A, 50.00));
		// Deposits.
		Xd1.start();
		Xd1_1.start();
		// Withdraws.
		Yw1.start();
		Yd1.start();
		// Views.
		Xb1.start();
		Yb1.start();
		Xd1_2.start();
		// Standing orders.
		Tsi.start();
	}

}
