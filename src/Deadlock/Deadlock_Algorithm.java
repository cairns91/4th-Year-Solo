package Deadlock;

/**
 * @author Greig Cairns
 * 
 * Algorithm technique for Deadlock.
 * 
 * GenerateIntitial(), runs the manual technique for testing including coverage and fitness,
 * to create the initial benchmark for the algorithm.
 * 
 * Algorithm then takes over running multiple times to attempt to cover more pairs by mixing 
 * up the thread execution order. This is the focus in this CUT as there is no numerical input
 * values to manipulate to improve coverage.
 * 
 */


public class Deadlock_Algorithm {
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	static Deadlock_TestCases tstD = new Deadlock_TestCases();
	static int x = 1;

	public static void TestCases() {
		tstD.Test1(lock1, lock1);
		tstD.Test2(lock2, lock2);
		tstD.Test3(lock1, lock1);
		tstD.Test4(lock2, lock2);
	}

	public static void D_Coverage() {
		Deadlock_Coverage.Pair2a2b();
		Deadlock_Coverage.Pair4a4b();
		Deadlock_Coverage.Pair2b2a();
		Deadlock_Coverage.Pair4b4a();
	}

	public static void GenerateInitial() {
		TestCases();
		Deadlock_SharedResources.populate();
		D_Coverage();
		Deadlock_SharedResources.D_fitnessUncovered.keySet()
				.removeAll(Deadlock_SharedResources.D_fitnessCovered.keySet());
		System.out.println(Deadlock_SharedResources.D_syncLocations);
		System.out.println();
		System.out.println("Size of ArrayList: " + Deadlock_SharedResources.D_syncLocations.size());
		Deadlock_SharedResources.print();
		Deadlock_Fitness.Rank();
	}

	public static void Generateloop() {

		while (x <= 11 || Deadlock_SharedResources.D_fitnessCovered.isEmpty()) {
			TestCases();
			D_Coverage();
			Deadlock_SharedResources.D_fitnessUncovered.keySet()
					.removeAll(Deadlock_SharedResources.D_fitnessCovered.keySet());
			x++;
		}
		Deadlock_SharedResources.print();
		Deadlock_Fitness.Rank();
	}

	public static void main(String[] args) throws InterruptedException {
		GenerateInitial();
		Generateloop();
	}
}