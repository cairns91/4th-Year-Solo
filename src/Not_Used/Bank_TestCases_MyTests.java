
package Not_Used;

import Bank.*;

/**
 * @author Greig Cairns
 * 
 *         This class contains the Test cases that were created by myself for
 *         the Bank System.
 *         
 *         <NOT USED>
 *
 */

public class Bank_TestCases_MyTests {

	int stop = 0;

	// Pair: <2a,4a> (getBalance,withdraw)
	public void Test1(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("1 Th1 ") {
			public void run() {
				account.getBalance();
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("1 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,2b> (getBalance,getBalance)
	public void Test2(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("2 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("2 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,4b> (getBalance,withdraw)
	public void Test3(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("3 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("3 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,2a> (withdraw,getBalance)
	public void Test4(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("4 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("4 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,2b> (withdraw,getBalance)
	public void Test5(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("5 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("5 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,4b> (withdraw,withdraw)
	public void Test6(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("6 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("6 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,4b> (getBalance,withdraw)
	public void Test7(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("7 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("7 Th2 ") {
			public void run() {
				account.getBalance();
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,2a> (getBalance,getBalance)
	public void Test8(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("8 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("8 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,4a> (getBalance,withdraw)
	public void Test9(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("9 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("9 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,2b> (withdraw,getBalance)
	public void Test10(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("10 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("10 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {
				}
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,2a> (withdraw,getBalance)
	public void Test11(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("11 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("11 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,4a> (withdraw,withdraw)
	public void Test12(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("12 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}

			}
		};

		Thread thread2 = new Thread("12 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,6a> (getBalance,deposit)
	public void Test13(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("13 Th1 ") {
			public void run() {
				account.getBalance();
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("13 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,2b> (getBalance,getBalance)
	public void Test14(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("14 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("14 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2a,6b> (getBalance,deposit)
	public void Test15(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("15 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("15 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,2a> (deposit,getBalance)
	public void Test16(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("16 Th1 ") {
			public void run() {
				account.deposit(amount);
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("16 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,2b> (deposit,getBalance)
	public void Test17(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("17 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("17 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,6b> (deposit,deposit)
	public void Test18(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("18 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("18 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,6b> (getBalance,deposit)
	public void Test19(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("19 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("19 Th2 ") {
			public void run() {
				account.getBalance();
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,2a> (getBalance,getBalance)
	public void Test20(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("20 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("20 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <2b,6a> (getBalance,deposit)
	public void Test21(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("21 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("21 Th2 ") {
			public void run() {
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,2b> (deposit,getBalance)
	public void Test22(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("22 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("22 Th2 ") {
			public void run() {
				account.deposit(amount);
				account.getBalance();
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,2a> (deposit,getBalance)
	public void Test23(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("23 Th1 ") {
			public void run() {
				account.getBalance();
			}
		};

		Thread thread2 = new Thread("23 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,6a> (deposit,deposit)
	public void Test24(int acc, double bal, double amount) {

		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("24 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("24 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,6a> (withdraw,deposit)
	public void Test25(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("25 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("25 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,4b> (withdraw,withdraw)
	public void Test26(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("26 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("26 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4a,6b> (withdraw,deposit)
	public void Test27(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("27 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("27 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,4a> (deposit,withdraw)
	public void Test28(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("28 Th1 ") {
			public void run() {
				account.deposit(amount);
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("28 Th2 ") {
			public void run() {
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,4b> (deposit,withdraw)
	public void Test29(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("29 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("29 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6a,6b> (deposit,deposit)
	public void Test30(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("30 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("30 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread1.start();
			thread1.join();
			thread2.start();
			thread2.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,6b> (withdraw,deposit)
	public void Test31(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("31 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("31 Th2 ") {
			@SuppressWarnings("deprecation")
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,4a> (withdraw,withdraw)
	public void Test32(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("32 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("32 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <4b,6a> (withdraw,deposit)
	public void Test33(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("33 Th1 ") {
			@SuppressWarnings("deprecation")
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("33 Th2 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,4b> (deposit,withdraw)
	public void Test34(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("34 Th1 ") {
			public void run() {
			}
		};

		Thread thread2 = new Thread("34 Th2 ") {
			public void run() {
				account.deposit(amount);
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,4a> (deposit,withdraw)
	public void Test35(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("35 Th1 ") {
			public void run() {
				try {
					account.withdraw(amount);
				} catch (InterruptedException e) {

				}
			}
		};

		Thread thread2 = new Thread("35 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}

	// Pair: <6b,6a> (deposit,deposit)
	public void Test36(int acc, double bal, double amount) {
		Account account = new Account(acc, bal);

		Thread thread1 = new Thread("36 Th1 ") {
			public void run() {
				account.deposit(amount);
			}
		};

		Thread thread2 = new Thread("36 Th2 ") {
			public void run() {
				account.deposit(amount);
			}
		};
		try {
			thread2.start();
			thread2.join();
			thread1.start();
			thread1.join();
		} catch (Exception e) {
		}
	}
}
