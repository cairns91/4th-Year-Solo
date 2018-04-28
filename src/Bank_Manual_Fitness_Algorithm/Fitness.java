package Bank_Manual_Fitness_Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import Bank_Coverage_SharedResources.Bank_Coverage_SharedResources;

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
 *         if the HashMap B_fitnessUncovered, contains the current pair being
 *         evaluated and the score is > than the new score that has been
 *         calculated, then update the score. else leave as the lower score.
 * 
 *         This means that if the same pair is found more than once either over
 *         multiple iterations or the possibility of a test covering the pair
 *         more than once, only the lowest score will be accepted.
 * 
 *         Covered pairs is removed later from this HashMap through the
 *         B_fitnessCovered Hashmap.
 * 
 */

public class Fitness {

	public static void Pair2a4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2a4a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2a4a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a4a", (secondIndex - firstIndex - 1));
			} else {
			}
		}
	}

	public static void Pair2a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2a2b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2a2b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2a4b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2a4b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a4b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4a2a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4a2a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a2a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4a2b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4a2b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a2b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4a4b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4a4b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2b4b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2b4b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b4b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2b2a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2b2a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2b4a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2b4a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b4a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4b2b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4b2b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b2b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4b2a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4b2a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b2a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4b4a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4b4a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2a6a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2a6a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2a6a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a6a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a6a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2a6b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2a6b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2a6b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a6b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2a6b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6a2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6a2a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6a2a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a2a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6a2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6a2b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6a2b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a2b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b6b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2b6b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2b6b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b6b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b6b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair2b6a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("2b6a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("2b6a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b6a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("2b6a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6b2b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6b2b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6b2b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b2b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b2b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6b2a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6b2a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6b2a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b2a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b2a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a6a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4a6a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4a6a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a6a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a6a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4a6b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4a6b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4a6b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a6b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4a6b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6a4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6a4a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6a4a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a4a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6a4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6a4b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6a4b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a4b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6a6b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6a6b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6a6b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a6b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6a6b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b6b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4b6b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4b6b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b6b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b6b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair4b6a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("4b6a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("4b6a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b6a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("4b6a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6b4b(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6b4b")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6b4b")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b4b", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b4b", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6b4a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) <= 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6b4a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6b4a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b4a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b4a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Pair6b6a(int firstIndex, int secondIndex) {
		if ((secondIndex - firstIndex - 1) < 0) {
		} else {
			if (Bank_Coverage_SharedResources.B_fitnessUncovered.containsKey("6b6a")
					&& (secondIndex - firstIndex - 1) < Bank_Coverage_SharedResources.B_fitnessUncovered.get("6b6a")) {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b6a", (secondIndex - firstIndex - 1));
			} else {
				Bank_Coverage_SharedResources.B_fitnessUncovered.put("6b6a", (secondIndex - firstIndex - 1));
			}
		}
	}

	public static void Rank() {
		Set<Entry<String, Integer>> set = Bank_Coverage_SharedResources.B_fitnessUncovered.entrySet();
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