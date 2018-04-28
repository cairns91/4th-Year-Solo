package Bank_Coverage_SharedResources;

/**
 * @author Greig Cairns
 * 
 *         This class calculates if each possible pair in the Banking System is
 *         covered. It does this by searching through the ArrayList sequentially
 *         to find the first sync location.
 * 
 *         It then searches the remaining positions in the ArrayList after the
 *         first found location to find the second location.
 * 
 *         From there it calculates if the second location is the position
 *         straight after the first locations position. If it is then that pair
 *         is covered and the pair is added to the HashSet of covered pairs.
 * 
 *         It is also added to the Hashmap of covered pairs to be used later to
 *         remove duplicates from the HashMap that is used to calculate the
 *         fitness.
 * 
 *         If the pair isn't covered then the fitness score is calculated for
 *         that pair.
 * 
 *         Each Test Case in Bank must have their own full coverage calculator
 *         that searches for each pair as we do not know which pairs are covered
 *         in each Test Case.
 */

public class Bank_Coverage_Tests_1 {

	public static void Pair2a4a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2a4a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2a4a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2a4a(firstIndex, secondIndex);
		}
	}

	public static void Pair2a2b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2a2b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2a2b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair2a4b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2a4b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2a4b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair4a2a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4a2a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4a2a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4a2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4a2b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4a2b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4a2b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair4a4b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4a4b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4a4b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b4b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2b4b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2b4b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2b4b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b2a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2b2a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2b2a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair2b4a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2b4a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2b4a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2b4a(firstIndex, secondIndex);
		}
	}

	public static void Pair4b2b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4b2b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4b2b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4b2b(firstIndex, secondIndex);
		}
	}

	public static void Pair4b2a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4b2a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4b2a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4b4a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4b4a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4b4a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4b4a(firstIndex, secondIndex);
		}
	}

	public static void Pair2a6a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2a6a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2a6a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2a6a(firstIndex, secondIndex);
		}
	}

	public static void Pair2a6b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2a6b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2a6b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2a6b(firstIndex, secondIndex);
		}
	}

	public static void Pair6a2a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6a2a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6a2a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6a2a(firstIndex, secondIndex);
		}
	}

	public static void Pair6a2b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6a2b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6a2b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b6b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2b6b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2b6b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2b6b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b6a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 getBalance")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("2b6a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("2b6a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair2b6a(firstIndex, secondIndex);
		}
	}

	public static void Pair6b2b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6b2b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6b2b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6b2b(firstIndex, secondIndex);
		}
	}

	public static void Pair6b2a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 getBalance")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6b2a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6b2a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4a6a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4a6a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4a6a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4a6a(firstIndex, secondIndex);
		}
	}

	public static void Pair4a6b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4a6b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4a6b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4a6b(firstIndex, secondIndex);
		}
	}

	public static void Pair6a4a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6a4a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6a4a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6a4a(firstIndex, secondIndex);
		}
	}

	public static void Pair6a4b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6a4b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6a4b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair6a6b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th1 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6a6b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6a6b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6a6b(firstIndex, secondIndex);
		}
	}

	public static void Pair4b6b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4b6b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4b6b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4b6b(firstIndex, secondIndex);
		}
	}

	public static void Pair4b6a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 withdraw")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("4b6a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("4b6a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair4b6a(firstIndex, secondIndex);
		}
	}

	public static void Pair6b4b_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th2 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6b4b");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6b4b", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6b4b(firstIndex, secondIndex);
		}
	}

	public static void Pair6b4a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 withdraw")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6b4a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6b4a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6b4a(firstIndex, secondIndex);
		}
	}

	public static void Pair6b6a_1() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Bank_Coverage_SharedResources.B_syncLocations.size(); i++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(i).equals("1 Th2 deposit")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Bank_Coverage_SharedResources.B_syncLocations.get(i);
			}
		}
		for (; lastIndex < Bank_Coverage_SharedResources.B_syncLocations.size(); lastIndex++) {
			if (Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex).equals("1 Th1 deposit")) {
				secondIndex = lastIndex;
				location2 = Bank_Coverage_SharedResources.B_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Bank_Coverage_SharedResources.B_coveredPairs.add("6b6a");
			Bank_Coverage_SharedResources.B_fitnessCovered.put("6b6a", 0);

		} else {
			Bank_Manual_Fitness_Algorithm.Fitness.Pair6b6a(firstIndex, secondIndex);
		}
	}
}