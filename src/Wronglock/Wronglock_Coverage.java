package Wronglock;

/**
 * @author Greig Cairns
 * 
 *  This class calculates if each possible pair is covered. It does this by searching through
 *  the ArrayList sequentially to find the first sync location.
 *  
 *  It then searches the remaining positions in the ArrayList after the first found location 
 *  to find the second location.
 *  
 *  From there it calculates if the second location is the position straight after the first
 *  locations position. If it is then that pair is covered and the pair is added to the 
 *  HashSet of covered pairs.
 *  
 *  It is also added to the Hashmap of covered fitness pairs to be used later
 *  to remove duplicates from the HashMap that is used to calculate the fitness.
 *  
 *  If the pair isn't covered then the fitness score is calculated for that pair.
 * 
 */

public class Wronglock_Coverage {

	public static void Pair2a4a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("1 Th1 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("1 Th1 B")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2a4a");
			Wronglock_SharedResources.W_fitnessCovered.put("2a4a", 0);

		} else {
			Wronglock_Fitness.Pair2a4a(firstIndex, secondIndex);
		}
	}

	public static void Pair2a2b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("2 Th1 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("2 Th2 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2a2b");
			Wronglock_SharedResources.W_fitnessCovered.put("2a2b", 0);

		} else {
			Wronglock_Fitness.Pair2a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair2a4b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("3 Th1 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("3 Th2 B")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2a4b");
			Wronglock_SharedResources.W_fitnessCovered.put("2a4b", 0);

		} else {
			Wronglock_Fitness.Pair2a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair4a2a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("4 Th1 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("4 Th1 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4a2a");
			Wronglock_SharedResources.W_fitnessCovered.put("4a2a", 0);

		} else {
			Wronglock_Fitness.Pair4a2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4a2b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("5 Th1 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("5 Th2 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4a2b");
			Wronglock_SharedResources.W_fitnessCovered.put("4a2b", 0);

		} else {
			Wronglock_Fitness.Pair4a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair4a4b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("6 Th1 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("6 Th2 B")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4a4b");
			Wronglock_SharedResources.W_fitnessCovered.put("4a4b", 0);

		} else {
			Wronglock_Fitness.Pair4a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b4b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("7 Th2 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("7 Th2 B")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2b4b");
			Wronglock_SharedResources.W_fitnessCovered.put("2b4b", 0);

		} else {
			Wronglock_Fitness.Pair2b4b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b2a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("8 Th2 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("8 Th1 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2b2a");
			Wronglock_SharedResources.W_fitnessCovered.put("2b2a", 0);

		} else {
			Wronglock_Fitness.Pair2b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair2b4a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("9 Th2 A")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("9 Th1 B")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("2b4a");
			Wronglock_SharedResources.W_fitnessCovered.put("2b4a", 0);

		} else {
			Wronglock_Fitness.Pair2b4a(firstIndex, secondIndex);
		}
	}

	public static void Pair4b2b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("10 Th2 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("10 Th2 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4b2b");
			Wronglock_SharedResources.W_fitnessCovered.put("4b2b", 0);

		} else {
			Wronglock_Fitness.Pair4b2b(firstIndex, secondIndex);
		}
	}

	public static void Pair4b2a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("11 Th2 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("11 Th1 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4b2a");
			Wronglock_SharedResources.W_fitnessCovered.put("4b2a", 0);

		} else {
			Wronglock_Fitness.Pair4b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4b4a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Wronglock_SharedResources.W_syncLocations.size(); i++) {
			if (Wronglock_SharedResources.W_syncLocations.get(i).equals("12 Th2 B")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Wronglock_SharedResources.W_syncLocations.get(i);
			}
		}
		for (; lastIndex < Wronglock_SharedResources.W_syncLocations.size(); lastIndex++) {
			if (Wronglock_SharedResources.W_syncLocations.get(lastIndex).equals("12 Th1 A")) {
				secondIndex = lastIndex;
				location2 = Wronglock_SharedResources.W_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Wronglock_SharedResources.W_coveredPairs.add("4b4a");
			Wronglock_SharedResources.W_fitnessCovered.put("4b4a", 0);

		} else {
			Wronglock_Fitness.Pair4b4a(firstIndex, secondIndex);
		}
	}

}