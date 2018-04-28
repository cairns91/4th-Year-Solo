package Bank_Coverage_SharedResources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 * @author Greig Cairns
 * 
 *         Stores the Arraylists and HashMaps used by the Banking system.
 * 
 *         ArrayList: B_syncLocations, stores each sync location made when a
 *         method is invoked within a test case.
 * 
 *         HashSet: B_coveredPairs, stores all the pairs B_coveredPairs in the manual
 *         testing and the first pass of the algorithm.
 *
 *         HashMap: B_fitnessUncovered, Begins with all available pairs and a
 *         score equal to the size of W_syncLocations + 1. When the manual tests
 *         are ran, these scores will be updated. Each iteration of the
 *         algorithm will also do this.
 * 
 *         HashMap: B_fitnessCovered, each time a score of 0 is found, the pair
 *         and the score of 0 is added to this HashMap and used at the end of
 *         manual testing/ algorithm iteration, to remove these covered pairs
 *         from the initial HashMap B_fitnessUncovered.
 *
 */
 
public class Bank_Coverage_SharedResources {

	public static ArrayList<String> B_syncLocations = new ArrayList<String>();
	public static HashSet<String> B_coveredPairs = new HashSet<String>();
	public static Map<String, Integer> B_fitnessUncovered = new HashMap<String, Integer>();
	public static Map<String, Integer> B_fitnessCovered = new HashMap<String, Integer>();

	public static void populate() {
		B_fitnessUncovered.put("2a4a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2a2b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2a4b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4a2a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4a2b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4a4b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2b4b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2b2a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2b4a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4b2b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4b2a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4b4a", B_syncLocations.size() + 1);

		B_fitnessUncovered.put("2a6a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2a6b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6a2a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6a2b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6a6b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2b6b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("2b6a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6b2b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6b2a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6b6a", B_syncLocations.size() + 1);

		B_fitnessUncovered.put("4a6a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4a6b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6a4a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6a4b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4b6b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("4b6a", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6b4b", B_syncLocations.size() + 1);
		B_fitnessUncovered.put("6b4a", B_syncLocations.size() + 1);
	}

	public static void print() {
		System.out.println();
		System.out.println("Synchronization B_syncLocations B_coveredPairs: " + B_coveredPairs + "  " + B_coveredPairs.size() + "/30");
		System.out.println();
		System.out.println();
	}
}