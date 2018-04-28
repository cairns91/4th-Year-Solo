package Deadlock;

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

public class Deadlock_Coverage {

	public static void Pair2a2b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Deadlock_SharedResources.D_syncLocations.size(); i++) {
			if (Deadlock_SharedResources.D_syncLocations.get(i).equals("1 Th1 lock1")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Deadlock_SharedResources.D_syncLocations.get(i);
			}
		}

		for (; lastIndex < Deadlock_SharedResources.D_syncLocations.size(); lastIndex++) {
			if (Deadlock_SharedResources.D_syncLocations.get(lastIndex).equals("1 Th2 lock1")) {
				secondIndex = lastIndex;
				location2 = Deadlock_SharedResources.D_syncLocations.get(lastIndex);
			}
		}

		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Deadlock_SharedResources.D_coveredPairs.add("2a2b");
			Deadlock_SharedResources.D_fitnessCovered.put("2a2b", 0);

		} else {
			Deadlock_Fitness.Pair2a2b(firstIndex, secondIndex);
		}
	}

	public static void Pair4a4b() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Deadlock_SharedResources.D_syncLocations.size(); i++) {
			if (Deadlock_SharedResources.D_syncLocations.get(i).equals("2 Th1 lock2")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Deadlock_SharedResources.D_syncLocations.get(i);
			}
		}
		for (; lastIndex < Deadlock_SharedResources.D_syncLocations.size(); lastIndex++) {
			if (Deadlock_SharedResources.D_syncLocations.get(lastIndex).equals("2 Th2 lock2")) {
				secondIndex = lastIndex;
				location2 = Deadlock_SharedResources.D_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Deadlock_SharedResources.D_coveredPairs.add("4a4b");
			Deadlock_SharedResources.D_fitnessCovered.put("4a4b", 0);

		} else {
			Deadlock_Fitness.Pair4a4b(firstIndex, secondIndex);
		}
	}

	public static void Pair2b2a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Deadlock_SharedResources.D_syncLocations.size(); i++) {
			if (Deadlock_SharedResources.D_syncLocations.get(i).equals("3 Th2 lock1")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Deadlock_SharedResources.D_syncLocations.get(i);
			}
		}
		for (; lastIndex < Deadlock_SharedResources.D_syncLocations.size(); lastIndex++) {
			if (Deadlock_SharedResources.D_syncLocations.get(lastIndex).equals("3 Th1 lock1")) {
				secondIndex = lastIndex;
				location2 = Deadlock_SharedResources.D_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Deadlock_SharedResources.D_coveredPairs.add("2b2a");
			Deadlock_SharedResources.D_fitnessCovered.put("2b2a", 0);

		} else {
			Deadlock_Fitness.Pair2b2a(firstIndex, secondIndex);
		}
	}

	public static void Pair4b4a() {
		int lastIndex = 0;
		int firstIndex = 0;
		int secondIndex = 0;
		String location1 = null;
		String location2 = null;

		for (int i = 0; i < Deadlock_SharedResources.D_syncLocations.size(); i++) {
			if (Deadlock_SharedResources.D_syncLocations.get(i).equals("4 Th2 lock2")) {
				lastIndex = i;
				firstIndex = i;
				location1 = Deadlock_SharedResources.D_syncLocations.get(i);
			}
		}
		for (; lastIndex < Deadlock_SharedResources.D_syncLocations.size(); lastIndex++) {
			if (Deadlock_SharedResources.D_syncLocations.get(lastIndex).equals("4 Th1 lock2")) {
				secondIndex = lastIndex;
				location2 = Deadlock_SharedResources.D_syncLocations.get(lastIndex);
			}
		}
		if (location1 != null && location2 != null && secondIndex == firstIndex + 1) {
			Deadlock_SharedResources.D_coveredPairs.add("4b4a");
			Deadlock_SharedResources.D_fitnessCovered.put("4b4a", 0);

		} else {
			Deadlock_Fitness.Pair4b4a(firstIndex, secondIndex);
		}
	}
}
