package Wronglock;

/**
 * @author Greig Cairns
 * 
 * Algorithm technique for Wronglock.
 * 
 * GenerateIntitial(), runs the manual technique for testing including coverage and fitness,
 * to create the initial benchmark for the algorithm.
 * 
 * Algorithm then takes over running multiple times to attempt to cover more pairs by mixing 
 * up the thread execution order. This is the focus in this CUT as there is no numerical input
 * values to manipulate to improve coverage.
 * 
 */

public class Wronglock_Algorithm {
	static Data data = new Data();
	static Wronglock_TestCases tstC = new Wronglock_TestCases();
	static int x = 1;

	public static void TestCases() {
		tstC.Test1(data);
		tstC.Test2(data);
		tstC.Test3(data);
		tstC.Test4(data);
		tstC.Test5(data);
		tstC.Test6(data);
		tstC.Test7(data);
		tstC.Test8(data);
		tstC.Test9(data);
		tstC.Test10(data);
		tstC.Test11(data);
		tstC.Test12(data);
	}

	public static void W_Coverage() {
		Wronglock_Coverage.Pair2a4a();
		Wronglock_Coverage.Pair2a2b();
		Wronglock_Coverage.Pair2a4b();
		Wronglock_Coverage.Pair4a2a();
		Wronglock_Coverage.Pair4a2b();
		Wronglock_Coverage.Pair4a4b();
		Wronglock_Coverage.Pair2b4b();
		Wronglock_Coverage.Pair2b2a();
		Wronglock_Coverage.Pair2b4a();
		Wronglock_Coverage.Pair4b2b();
		Wronglock_Coverage.Pair4b2a();
		Wronglock_Coverage.Pair4b4a();
		Wronglock_Coverage.Pair4a2a();
	}

	public static void GenerateInitial() {
		TestCases();
		Wronglock_SharedResources.populate();
		W_Coverage();
		Wronglock_SharedResources.W_fitnessUncovered.keySet().removeAll(Wronglock_SharedResources.W_fitnessCovered.keySet());
		System.out.println(Wronglock_SharedResources.W_syncLocations);
		System.out.println();
		System.out.println("Size of ArrayList: " + Wronglock_SharedResources.W_syncLocations.size());
		Wronglock_SharedResources.print();
		Wronglock_Fitness.Rank();
	}

	public static void Generateloop() {

		while (x <= 11) {
			TestCases();
			W_Coverage();
			Wronglock_SharedResources.W_fitnessUncovered.keySet().removeAll(Wronglock_SharedResources.W_fitnessCovered.keySet());
			x++;
		}
		Wronglock_SharedResources.print();
		Wronglock_Fitness.Rank();
	}

	public static void main(String[] args) throws InterruptedException {
		GenerateInitial();
		Generateloop();
	}
}