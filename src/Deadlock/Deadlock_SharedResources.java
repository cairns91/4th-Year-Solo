package Deadlock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 
 * @author Greig Cairns
 * 
 *         Stores the Arraylists and HashMaps used by the system for Deadlock.
 * 
 *         ArrayList: D_syncLocations, stores each sync location made when a
 *         method is invoked within a test case.
 * 
 *         HashSet: D_coveredPairs, stores all the pairs covered in the manual
 *         testing and the first pass of the algorithm.
 *
 *         HashMap: D_fitnessUncovered, Begins with all available pairs and a
 *         score equal to the size of D_syncLocations + 1. When the manual tests
 *         are ran, these scores will be updated. Each iteration of the
 *         algorithm will also do this.
 * 
 *         HashMap: D_fitnessCovered, each time a score of 0 is found, the pair
 *         and the score of 0 is added to this HashMap and used at the end of
 *         manual testing/ algorithm iteration, to remove these covered pairs
 *         from the initial HashMap D_fitnessUncoveredUncovered.
 *
 */

public class Deadlock_SharedResources {

	public static ArrayList<String> D_syncLocations = new ArrayList<String>();
	public static HashSet<String> D_coveredPairs = new HashSet<String>();
	public static Map<String, Integer> D_fitnessUncovered = new HashMap<String, Integer>();
	public static Map<String, Integer> D_fitnessCovered = new HashMap<String, Integer>();

	public static void populate() {

		D_fitnessUncovered.put("2a2b", D_syncLocations.size() + 1);
		D_fitnessUncovered.put("4a4b", D_syncLocations.size() + 1);
		D_fitnessUncovered.put("2b2a", D_syncLocations.size() + 1);
		D_fitnessUncovered.put("4b4a", D_syncLocations.size() + 1);
	}

	public static void print() {
		System.out.println();
		System.out.println("Synchronization D_syncLocations D_coveredPairs: " + D_coveredPairs + "  " + D_coveredPairs.size() + "/4");
		System.out.println();
		System.out.println();
	}
}