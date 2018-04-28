package Deadlock;

/**
 * @author Greig Cairns
 * 
 *         This class runs the Test Cases manually, calculates the coverage and
 *         then calculates and ranks the fitness score for every uncovered pair.
 */

public class Deadlock_Manual {

	public static void D_Coverage() {
		Deadlock_Coverage.Pair2a2b();
		Deadlock_Coverage.Pair4a4b();
		Deadlock_Coverage.Pair4a4b();
		Deadlock_Coverage.Pair4b4a();
	}

	public static void TestCases() {
		Object lock1 = new Object();
		Object lock2 = new Object();
		Deadlock_TestCases tstC = new Deadlock_TestCases();

		tstC.Test1(lock1, lock2);
		tstC.Test2(lock1, lock2);
		tstC.Test3(lock1, lock2);
		tstC.Test4(lock1, lock2);
	}

	public static void main(String[] args) {
		TestCases();
		Deadlock_SharedResources.populate();
		D_Coverage();
		System.out.println(Deadlock_SharedResources.D_syncLocations);
		System.out.println();
		System.out.println("Size of ArrayList: " + Deadlock_SharedResources.D_syncLocations.size());
		Deadlock_SharedResources.D_fitnessUncovered.keySet()
				.removeAll(Deadlock_SharedResources.D_fitnessCovered.keySet());
		Deadlock_SharedResources.print();
		Deadlock_Fitness.Rank();
	}
}