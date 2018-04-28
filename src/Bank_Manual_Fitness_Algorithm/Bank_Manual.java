package Bank_Manual_Fitness_Algorithm;

import Bank_Coverage_SharedResources.Bank_Coverage_Tests_1;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_2;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_3;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_4;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_5;
import java.util.Random;
import Bank_Coverage_SharedResources.Bank_Coverage_SharedResources;
import Bank_TestCases.*;

/**
 * @author Greig Cairns
 * 
 *         This class runs the Test Cases manually, using random input and
 *         calculates the coverage. Then calculates and ranks the fitness score
 *         for every uncovered pair.
 */

public class Bank_Manual {

	static Bank_TestCases tstC_OT = new Bank_TestCases();

	static Random rnd = new Random();

	public static void TestCases() {
		tstC_OT.TestDriver1(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_OT.TestDriver2(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_OT.TestDriver3(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_OT.TestDriver4(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_OT.TestDriver5(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
	}

	public static void Coverage_1() {
		Bank_Coverage_Tests_1.Pair2a4a_1();
		Bank_Coverage_Tests_1.Pair2a2b_1();
		Bank_Coverage_Tests_1.Pair2a4b_1();
		Bank_Coverage_Tests_1.Pair4a2a_1();
		Bank_Coverage_Tests_1.Pair4a2b_1();
		Bank_Coverage_Tests_1.Pair4a4b_1();
		Bank_Coverage_Tests_1.Pair2b4b_1();
		Bank_Coverage_Tests_1.Pair2b2a_1();
		Bank_Coverage_Tests_1.Pair2b4a_1();
		Bank_Coverage_Tests_1.Pair4b2b_1();
		Bank_Coverage_Tests_1.Pair4b2a_1();
		Bank_Coverage_Tests_1.Pair4b4a_1();

		Bank_Coverage_Tests_1.Pair2a6a_1();
		Bank_Coverage_Tests_1.Pair2a6b_1();
		Bank_Coverage_Tests_1.Pair6a2a_1();
		Bank_Coverage_Tests_1.Pair6a2b_1();
		Bank_Coverage_Tests_1.Pair2b6b_1();
		Bank_Coverage_Tests_1.Pair2b6a_1();
		Bank_Coverage_Tests_1.Pair6b2b_1();
		Bank_Coverage_Tests_1.Pair6b2a_1();

		Bank_Coverage_Tests_1.Pair4a6a_1();
		Bank_Coverage_Tests_1.Pair4a6b_1();
		Bank_Coverage_Tests_1.Pair6a4a_1();
		Bank_Coverage_Tests_1.Pair6a4b_1();
		Bank_Coverage_Tests_1.Pair6a6b_1();
		Bank_Coverage_Tests_1.Pair4b6b_1();
		Bank_Coverage_Tests_1.Pair4b6a_1();
		Bank_Coverage_Tests_1.Pair6b4b_1();
		Bank_Coverage_Tests_1.Pair6b4a_1();
		Bank_Coverage_Tests_1.Pair6b6a_1();
	}

	public static void Coverage_2() {
		Bank_Coverage_Tests_2.Pair2a4a_2();
		Bank_Coverage_Tests_2.Pair2a2b_2();
		Bank_Coverage_Tests_2.Pair2a4b_2();
		Bank_Coverage_Tests_2.Pair4a2a_2();
		Bank_Coverage_Tests_2.Pair4a2b_2();
		Bank_Coverage_Tests_2.Pair4a4b_2();
		Bank_Coverage_Tests_2.Pair2b4b_2();
		Bank_Coverage_Tests_2.Pair2b2a_2();
		Bank_Coverage_Tests_2.Pair2b4a_2();
		Bank_Coverage_Tests_2.Pair4b2b_2();
		Bank_Coverage_Tests_2.Pair4b2a_2();
		Bank_Coverage_Tests_2.Pair4b4a_2();

		Bank_Coverage_Tests_2.Pair2a6a_2();
		Bank_Coverage_Tests_2.Pair2a6b_2();
		Bank_Coverage_Tests_2.Pair6a2a_2();
		Bank_Coverage_Tests_2.Pair6a2b_2();
		Bank_Coverage_Tests_2.Pair2b6b_2();
		Bank_Coverage_Tests_2.Pair2b6a_2();
		Bank_Coverage_Tests_2.Pair6b2b_2();
		Bank_Coverage_Tests_2.Pair6b2a_2();

		Bank_Coverage_Tests_2.Pair4a6a_2();
		Bank_Coverage_Tests_2.Pair4a6b_2();
		Bank_Coverage_Tests_2.Pair6a4a_2();
		Bank_Coverage_Tests_2.Pair6a4b_2();
		Bank_Coverage_Tests_2.Pair6a6b_2();
		Bank_Coverage_Tests_2.Pair4b6b_2();
		Bank_Coverage_Tests_2.Pair4b6a_2();
		Bank_Coverage_Tests_2.Pair6b4b_2();
		Bank_Coverage_Tests_2.Pair6b4a_2();
		Bank_Coverage_Tests_2.Pair6b6a_2();
	}

	public static void Coverage_3() {
		Bank_Coverage_Tests_3.Pair2a4a_3();
		Bank_Coverage_Tests_3.Pair2a2b_3();
		Bank_Coverage_Tests_3.Pair2a4b_3();
		Bank_Coverage_Tests_3.Pair4a2a_3();
		Bank_Coverage_Tests_3.Pair4a2b_3();
		Bank_Coverage_Tests_3.Pair4a4b_3();
		Bank_Coverage_Tests_3.Pair2b4b_3();
		Bank_Coverage_Tests_3.Pair2b2a_3();
		Bank_Coverage_Tests_3.Pair2b4a_3();
		Bank_Coverage_Tests_3.Pair4b2b_3();
		Bank_Coverage_Tests_3.Pair4b2a_3();
		Bank_Coverage_Tests_3.Pair4b4a_3();

		Bank_Coverage_Tests_3.Pair2a6a_3();
		Bank_Coverage_Tests_3.Pair2a6b_3();
		Bank_Coverage_Tests_3.Pair6a2a_3();
		Bank_Coverage_Tests_3.Pair6a2b_3();
		Bank_Coverage_Tests_3.Pair2b6b_3();
		Bank_Coverage_Tests_3.Pair2b6a_3();
		Bank_Coverage_Tests_3.Pair6b2b_3();
		Bank_Coverage_Tests_3.Pair6b2a_3();

		Bank_Coverage_Tests_3.Pair4a6a_3();
		Bank_Coverage_Tests_3.Pair4a6b_3();
		Bank_Coverage_Tests_3.Pair6a4a_3();
		Bank_Coverage_Tests_3.Pair6a4b_3();
		Bank_Coverage_Tests_3.Pair6a6b_3();
		Bank_Coverage_Tests_3.Pair4b6b_3();
		Bank_Coverage_Tests_3.Pair4b6a_3();
		Bank_Coverage_Tests_3.Pair6b4b_3();
		Bank_Coverage_Tests_3.Pair6b4a_3();
		Bank_Coverage_Tests_3.Pair6b6a_3();
	}

	public static void Coverage_4() {
		Bank_Coverage_Tests_4.Pair2a4a_4();
		Bank_Coverage_Tests_4.Pair2a2b_4();
		Bank_Coverage_Tests_4.Pair2a4b_4();
		Bank_Coverage_Tests_4.Pair4a2a_4();
		Bank_Coverage_Tests_4.Pair4a2b_4();
		Bank_Coverage_Tests_4.Pair4a4b_4();
		Bank_Coverage_Tests_4.Pair2b4b_4();
		Bank_Coverage_Tests_4.Pair2b2a_4();
		Bank_Coverage_Tests_4.Pair2b4a_4();
		Bank_Coverage_Tests_4.Pair4b2b_4();
		Bank_Coverage_Tests_4.Pair4b2a_4();
		Bank_Coverage_Tests_4.Pair4b4a_4();

		Bank_Coverage_Tests_4.Pair2a6a_4();
		Bank_Coverage_Tests_4.Pair2a6b_4();
		Bank_Coverage_Tests_4.Pair6a2a_4();
		Bank_Coverage_Tests_4.Pair6a2b_4();
		Bank_Coverage_Tests_4.Pair2b6b_4();
		Bank_Coverage_Tests_4.Pair2b6a_4();
		Bank_Coverage_Tests_4.Pair6b2b_4();
		Bank_Coverage_Tests_4.Pair6b2a_4();

		Bank_Coverage_Tests_4.Pair4a6a_4();
		Bank_Coverage_Tests_4.Pair4a6b_4();
		Bank_Coverage_Tests_4.Pair6a4a_4();
		Bank_Coverage_Tests_4.Pair6a4b_4();
		Bank_Coverage_Tests_4.Pair6a6b_4();
		Bank_Coverage_Tests_4.Pair4b6b_4();
		Bank_Coverage_Tests_4.Pair4b6a_4();
		Bank_Coverage_Tests_4.Pair6b4b_4();
		Bank_Coverage_Tests_4.Pair6b4a_4();
		Bank_Coverage_Tests_4.Pair6b6a_4();
	}

	public static void Coverage_5() {
		Bank_Coverage_Tests_5.Pair2a4a_5();
		Bank_Coverage_Tests_5.Pair2a2b_5();
		Bank_Coverage_Tests_5.Pair2a4b_5();
		Bank_Coverage_Tests_5.Pair4a2a_5();
		Bank_Coverage_Tests_5.Pair4a2b_5();
		Bank_Coverage_Tests_5.Pair4a4b_5();
		Bank_Coverage_Tests_5.Pair2b4b_5();
		Bank_Coverage_Tests_5.Pair2b2a_5();
		Bank_Coverage_Tests_5.Pair2b4a_5();
		Bank_Coverage_Tests_5.Pair4b2b_5();
		Bank_Coverage_Tests_5.Pair4b2a_5();
		Bank_Coverage_Tests_5.Pair4b4a_5();

		Bank_Coverage_Tests_5.Pair2a6a_5();
		Bank_Coverage_Tests_5.Pair2a6b_5();
		Bank_Coverage_Tests_5.Pair6a2a_5();
		Bank_Coverage_Tests_5.Pair6a2b_5();
		Bank_Coverage_Tests_5.Pair2b6b_5();
		Bank_Coverage_Tests_5.Pair2b6a_5();
		Bank_Coverage_Tests_5.Pair6b2b_5();
		Bank_Coverage_Tests_5.Pair6b2a_5();

		Bank_Coverage_Tests_5.Pair4a6a_5();
		Bank_Coverage_Tests_5.Pair4a6b_5();
		Bank_Coverage_Tests_5.Pair6a4a_5();
		Bank_Coverage_Tests_5.Pair6a4b_5();
		Bank_Coverage_Tests_5.Pair6a6b_5();
		Bank_Coverage_Tests_5.Pair4b6b_5();
		Bank_Coverage_Tests_5.Pair4b6a_5();
		Bank_Coverage_Tests_5.Pair6b4b_5();
		Bank_Coverage_Tests_5.Pair6b4a_5();
		Bank_Coverage_Tests_5.Pair6b6a_5();
	}

	public static void main(String[] args) throws InterruptedException {
		TestCases();
		Bank_Coverage_SharedResources.populate();
		Coverage_1();
		Coverage_2();
		Coverage_3();
		Coverage_4();
		Coverage_5();
		System.out.println(Bank_Coverage_SharedResources.B_syncLocations);
		System.out.println();
		System.out.println("Size of ArrayList: " + Bank_Coverage_SharedResources.B_syncLocations.size());
		Bank_Coverage_SharedResources.B_fitnessUncovered.keySet()
				.removeAll(Bank_Coverage_SharedResources.B_fitnessCovered.keySet());
		Bank_Coverage_SharedResources.print();
		Bank_Manual_Fitness_Algorithm.Fitness.Rank();
	}
}
