package Deadlock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * 
 * @author Greig Cairns
 * 
 *         This class calculates the fitness score of each uncovered pair. Does
 *         this by calculating the distance between each pair in the ArrayList
 *         of sync locations
 * 
 *         If the distance/ score is < 0, the pair can't be covered as it has
 *         been found in reverse so do not update the current score.
 * 
 *         if the HashMap D_fitnessUncovered, contains the current pair being
 *         evaluated and the score is > than the new score that has been
 *         calculated, then update the score. else leave as the lower score.
 * 
 *         This means that if the same pair is found more than once either over
 *         multiple iterations or the possibility of a test covering the pair
 *         more than once, only the lowest score will be accepted.
 * 
 *         Covered pairs is removed later from this HashMap through the
 *         D_fitnessCovered Hashmap.
 * 
 */

public class Deadlock_Fitness {

	public static void Pair2a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Deadlock_SharedResources.D_fitnessUncovered.containsKey("2a2b")
					&& (secondIndex - firstIndex - 1) < Deadlock_SharedResources.D_fitnessUncovered.get("2a2b")) {
				Deadlock_SharedResources.D_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			} else {
				Deadlock_SharedResources.D_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Deadlock_SharedResources.D_fitnessUncovered.containsKey("4a4b")
					&& (secondIndex - firstIndex - 1) < Deadlock_SharedResources.D_fitnessUncovered.get("4a4b")) {
				Deadlock_SharedResources.D_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			} else {
				Deadlock_SharedResources.D_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Deadlock_SharedResources.D_fitnessUncovered.containsKey("2b2a")
					&& (secondIndex - firstIndex - 1) < Deadlock_SharedResources.D_fitnessUncovered.get("2b2a")) {
				Deadlock_SharedResources.D_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			} else {
				Deadlock_SharedResources.D_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Deadlock_SharedResources.D_fitnessUncovered.containsKey("4b4a")
					&& (secondIndex - firstIndex - 1) < Deadlock_SharedResources.D_fitnessUncovered.get("4b4a")) {
				Deadlock_SharedResources.D_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			} else {
				Deadlock_SharedResources.D_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Rank() {
		Set<Entry<String, Integer>> set = Deadlock_SharedResources.D_fitnessUncovered.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue());
		}
	}
}
