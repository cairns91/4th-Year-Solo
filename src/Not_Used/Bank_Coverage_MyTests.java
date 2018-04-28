package Not_Used;

import java.util.ArrayList;

public class Bank_Coverage_MyTests {

	public static ArrayList<String> SynchLocations = new ArrayList<String>();
	static int covered = 0;

	public static void Pair2a4a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a4a> not covered ");
			System.out.println();
		}
	}

	public static void Pair2a2b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("2 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("2 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a2b> not covered ");
			System.out.println();
		}
	}

	public static void Pair2a4b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("3 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("3 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a4b> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a2a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("4 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("4 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a2a> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a2b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("5 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("5 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a2b> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a4b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("6 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("6 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a4b> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b4b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("7 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("7 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b4b> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b2a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("8 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("8 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b2a> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b4a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("9 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("9 Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b4a> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b2b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("10 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("10 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b2b> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b2a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("11 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("11 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b2a> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b4a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("12 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("12" + " Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b4a> not covered ");
			System.out.println();
		}
	}

	public static void Pair2a6a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("13 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("13 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a6a> not covered ");
			System.out.println();
		}
	}

	public static void Pair2a2b_BD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("14 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("14 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a2b_BD> not covered ");
			System.out.println();
		}
	}

	public static void Pair2a6b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("15 Th1 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("15 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2a6b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a2a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("16 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("16 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a2a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a2b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("17 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("17 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a2b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a6b_BD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("18 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("18 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a6b_BD> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b6b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("19 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("19 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b6b> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b2a_BD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("20 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("20 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b2a_BD> not covered ");
			System.out.println();
		}
	}

	public static void Pair2b6a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("21 Th2 getBalance")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("21 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <2b6a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b2b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("22 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("22 Th2 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b2b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b2a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("23 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("23 Th1 getBalance")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b2a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b6a_BD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("24 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("24 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b6a_BD> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a6a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("25 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("25 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a6a> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a4b_WD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("26 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("26 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a4b_WD> not covered ");
			System.out.println();
		}
	}

	public static void Pair4a6b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("27 Th1 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("27 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4a6b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a4a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("28 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("28 Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a4a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a4b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("29 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("29 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a4b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6a6b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("30 Th1 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("30 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6a6b> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b6b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("31 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("31 Th2 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b6b> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b4a_WD() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("32 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("32 Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b4a_WD> not covered ");
			System.out.println();
		}
	}

	public static void Pair4b6a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("33 Th2 withdraw")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("33 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <4b6a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b4b() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("34 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("34 Th2 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b4b> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b4a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("35 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("35 Th1 withdraw")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b4a> not covered ");
			System.out.println();
		}
	}

	public static void Pair6b6a() {
		int lastIndex = 0;
		String pair1 = null;
		String pair2 = null;

		for (int i = 0; i < SynchLocations.size(); i++) {
			if (SynchLocations.get(i).equals("36 Th2 deposit")) {
				lastIndex = i;
				pair1 = SynchLocations.get(i);
			}
		}
		for (; lastIndex < SynchLocations.size(); lastIndex++) {
			if (SynchLocations.get(lastIndex).equals("36 Th1 deposit")) {
				pair2 = SynchLocations.get(lastIndex);
			}
		}
		if (pair1 != null && pair2 != null) {
			covered = covered + 1;
		} else {
			System.out.println("Pair: <6b6a> not covered ");
			System.out.println();
		}
	}

	public static void print() {
		System.out.println(SynchLocations);
		System.out.println();
		System.out.println("Synchronization SynchLocations Covered: " + covered + "/36");
	}
}
