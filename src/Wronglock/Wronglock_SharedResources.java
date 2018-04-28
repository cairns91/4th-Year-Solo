package Wronglock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 * @author Greig Cairns
 * 
 *         Stores the Arraylists and HashMaps used by the system for Wronglock.
 * 
 *         ArrayList: W_syncLocations, stores each sync location made when a
 *         method is invoked within a test case.
 * 
 *         HashSet: W_coveredPairs, stores all the pairs covered in the manual
 *         testing and the first pass of the algorithm.
 *
 *         HashMap: W_fitnessUncovered, Begins with all available pairs and a
 *         score equal to the size of W_syncLocations + 1. When the manual tests
 *         are ran, these scores will be updated. Each iteration of the
 *         algorithm will also do this.
 * 
 *         HashMap: W_fitnessCovered, each time a score of 0 is found, the pair
 *         and the score of 0 is added to this HashMap and used at the end of
 *         manual testing/ algorithm iteration, to remove these covered pairs
 *         from the initial HashMap W_fitnessUncovered.
 *
 */

public class Wronglock_SharedResources {

	public static ArrayList<String> W_syncLocations = new ArrayList<String>();
	public static HashSet<String> W_coveredPairs = new HashSet<String>();
	public static Map<String, Integer> W_fitnessUncovered = new HashMap<String, Integer>();
	public static Map<String, Integer> W_fitnessCovered = new HashMap<String, Integer>();

	public static void populate() {
		W_fitnessUncovered.put("2a4a", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("2a2b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("2a4b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4a2a", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4a2b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4a4b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("2b4b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("2b2a", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("2b4a", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4b2b", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4b2a", W_syncLocations.size() + 1);
		W_fitnessUncovered.put("4b4a", W_syncLocations.size() + 1);
	}

	public static void print() {
		System.out.println();
		System.out.println("Synchronization pairs covered: " + W_coveredPairs + "  " + W_coveredPairs.size() + "/12");
		System.out.println();
		System.out.println();
	}
}