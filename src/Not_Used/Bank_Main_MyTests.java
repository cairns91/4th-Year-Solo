package Not_Used;

import java.util.Random;

/**
 * @author Greig Cairns
 * 
 *         This class runs the Test Cases manually, calculates the coverage and
 *         then calculates and ranks the fitness score for every uncovered pair.
 * 
 *         <NOT USED>
 */

public class Bank_Main_MyTests {

	static Bank_TestCases_MyTests tstC_BW = new Bank_TestCases_MyTests();

	static Random rnd = new Random();

	public static void TestCases() {
		tstC_BW.Test1(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test2(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test3(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test4(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test5(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test6(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test7(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test8(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test9(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test10(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test11(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test12(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());

		tstC_BW.Test13(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test14(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test15(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test16(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test17(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test18(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test19(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test20(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test21(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test22(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test23(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test24(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());

		tstC_BW.Test25(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test26(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test27(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test28(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test29(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test30(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test31(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test32(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test33(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test34(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test35(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
		tstC_BW.Test36(rnd.nextInt(), rnd.nextDouble(), rnd.nextDouble());
	}

	public static void Coverage() {
		Bank_Coverage_MyTests.Pair2a4a();
		Bank_Coverage_MyTests.Pair2a2b();
		Bank_Coverage_MyTests.Pair2a4b();
		Bank_Coverage_MyTests.Pair4a2a();
		Bank_Coverage_MyTests.Pair4a2b();
		Bank_Coverage_MyTests.Pair4a4b();
		Bank_Coverage_MyTests.Pair2b4b();
		Bank_Coverage_MyTests.Pair2b2a();
		Bank_Coverage_MyTests.Pair2b4a();
		Bank_Coverage_MyTests.Pair4b2b();
		Bank_Coverage_MyTests.Pair4b2a();
		Bank_Coverage_MyTests.Pair4b4a();

		Bank_Coverage_MyTests.Pair2a6a();
		Bank_Coverage_MyTests.Pair2a2b_BD();
		Bank_Coverage_MyTests.Pair2a6b();
		Bank_Coverage_MyTests.Pair6a2a();
		Bank_Coverage_MyTests.Pair6a2b();
		Bank_Coverage_MyTests.Pair6a6b_BD();
		Bank_Coverage_MyTests.Pair2b6b();
		Bank_Coverage_MyTests.Pair2b2a_BD();
		Bank_Coverage_MyTests.Pair2b6a();
		Bank_Coverage_MyTests.Pair6b2b();
		Bank_Coverage_MyTests.Pair6b2a();
		Bank_Coverage_MyTests.Pair6b6a_BD();

		Bank_Coverage_MyTests.Pair4a6a();
		Bank_Coverage_MyTests.Pair4a4b_WD();
		Bank_Coverage_MyTests.Pair4a6b();
		Bank_Coverage_MyTests.Pair6a4a();
		Bank_Coverage_MyTests.Pair6a4b();
		Bank_Coverage_MyTests.Pair6a6b();
		Bank_Coverage_MyTests.Pair4b6b();
		Bank_Coverage_MyTests.Pair4b4a_WD();
		Bank_Coverage_MyTests.Pair4b6a();
		Bank_Coverage_MyTests.Pair6b4b();
		Bank_Coverage_MyTests.Pair6b4a();
		Bank_Coverage_MyTests.Pair6b6a();

		Bank_Coverage_MyTests.print();
	}

	public static void main(String[] args) throws InterruptedException {
		TestCases();
		Coverage();
	}
}