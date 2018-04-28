package Wronglock;

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
 * This class calculates the W_fitnessUncovered score of each uncovered pair.
 * Does this by calculating the distance between each pair in the ArrayList of sync locations
 * 
 * If the distance/ score is < 0, the pair can't be covered as it has been found in reverse
 * so do not update the current score.
 * 
 * if the HashMap W_fitnessUncovered, contains the current pair being evaluated and the score
 * is > than the new score that has been calculated, then update the score. else leave
 * as the lower score.
 * 
 * This means that if the same pair is found more than once either over multiple iterations 
 * or the possibility of a test covering the pair more than once, only the lowest score 
 * will be accepted.
 * 
 * Covered pairs is removed later from this HashMap through the W_fitnessCovered Hashmap.
 * 
 */

public class Wronglock_Fitness {

	public static void Pair2a4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2a4a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2a4a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2a4a", (secondIndex - firstIndex - 1));
			} else {
			}
		}
	}

	public static void Pair2a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2a2b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2a2b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2a4b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2a4b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2a4b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("2a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4a2a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4a2a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a2a", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4a2b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4a2b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a2b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4a4b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4a4b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2b4b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2b4b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b4b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2b2a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2b2a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("2b4a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("2b4a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b4a", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("2b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4b2b")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4b2b")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b2b", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4b2a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4b2a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b2a", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Wronglock_SharedResources.W_fitnessUncovered.containsKey("4b4a")
					&& (secondIndex - firstIndex - 1) < Wronglock_SharedResources.W_fitnessUncovered.get("4b4a")) {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			} else {
				Wronglock_SharedResources.W_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Rank() {
		Set<Entry<String, Integer>> set = Wronglock_SharedResources.W_fitnessUncovered.entrySet();
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