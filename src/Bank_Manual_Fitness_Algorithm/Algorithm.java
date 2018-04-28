package Bank_Manual_Fitness_Algorithm;


import Bank_Coverage_SharedResources.Bank_Coverage_Tests_1;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_2;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_3;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_4;
import Bank_Coverage_SharedResources.Bank_Coverage_Tests_5;
import java.util.Random;
import Bank_Coverage_SharedResources.Bank_Coverage_SharedResources;
import Bank_TestCases.Bank_TestCases;

/**
 * 
 * The algorithm begins with the random manual testing solution and then begins
 * to improve the input data over a number of iterations. The amount decreases
 * as the balance increases over the iterations towards an optimal solution.
 * 
 * Once the iterations are complete, the algorithm displays the new covered
 * pairs (if any) and updated B_fitnessUncovered scores of uncovered pairs (if
 * any)
 */

public class Algorithm {

	static Bank_TestCases tstAlg = new Bank_TestCases();
	static Random rnd = new Random();
	static int x = 1;
	static double inputMod;

	public static void TestCasesRandom() {
		tstAlg.TestDriver1(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstAlg.TestDriver2(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstAlg.TestDriver3(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstAlg.TestDriver4(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstAlg.TestDriver5(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
	}

	public static void AVMTestSuite() {
		tstAlg.TestDriver1(rnd.nextInt(), Bank_TestCases.test1Amount - inputMod,
				Bank_TestCases.test1Balance + inputMod);
		tstAlg.TestDriver2(rnd.nextInt(), Bank_TestCases.test2Amount - inputMod,
				Bank_TestCases.test2Balance + inputMod);
		tstAlg.TestDriver3(rnd.nextInt(), Bank_TestCases.test3Amount - inputMod,
				Bank_TestCases.test3Balance + inputMod);
		tstAlg.TestDriver4(rnd.nextInt(), Bank_TestCases.test4Amount - inputMod,
				Bank_TestCases.test4Balance + inputMod);
		tstAlg.TestDriver5(rnd.nextInt(), Bank_TestCases.test5Amount - inputMod,
				Bank_TestCases.test5Balance + inputMod);
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

	public static void GenerateInitial() {
		TestCasesRandom();
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

	public static void inputMod() {
		double percentage = 10.0f;

		for (float value : Bank_Coverage_SharedResources.B_fitnessUncovered.values()) {
			float totalB_fitnessUncovered = value;

			inputMod = ((totalB_fitnessUncovered * (percentage / 100.0f)) * x);
			percentage += 5.0f;
		}
	}

	public static void Generateloop() {

		while (x <= 11 || Bank_Coverage_SharedResources.B_fitnessUncovered.isEmpty()) {
			if (Bank.Account.enoughFundsCondition != null) {

				inputMod();
				AVMTestSuite();
				Coverage_1();
				Coverage_2();
				Coverage_3();
				Coverage_4();
				Coverage_5();
			} else {
			}
			Bank_Coverage_SharedResources.B_fitnessUncovered.keySet()
					.removeAll(Bank_Coverage_SharedResources.B_fitnessCovered.keySet());
			x++;
		}
		Bank_Coverage_SharedResources.print();
		Bank_Manual_Fitness_Algorithm.Fitness.Rank();
	}

	public static void main(String[] args) throws InterruptedException {
		GenerateInitial();
		Generateloop();
	}
}