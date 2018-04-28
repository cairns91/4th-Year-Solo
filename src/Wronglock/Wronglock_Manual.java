package Wronglock;

import Wronglock.Wronglock_SharedResources;

/**
 * @author Greig Cairns
 * 
 *         This class runs the Test Cases manually, calculates the coverage and then
 *         calculates and ranks the fitness score for every uncovered pair.
 */

public class Wronglock_Manual extends Wronglock_Coverage {

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

	public static void TestCases() {
		Data data = new Data();
		Wronglock_TestCases tstC = new Wronglock_TestCases();

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

	public static void main(String[] args) throws InterruptedException {
		TestCases();
		Wronglock_SharedResources.populate();
		W_Coverage();
		System.out.println(Wronglock_SharedResources.W_syncLocations);
		System.out.println();
		System.out.println("Size of ArrayList: " + Wronglock_SharedResources.W_syncLocations.size());
		Wronglock_SharedResources.W_fitnessUncovered.keySet()
				.removeAll(Wronglock_SharedResources.W_fitnessCovered.keySet());
		Wronglock_SharedResources.print();
		Wronglock_Fitness.Rank();
	}
}
