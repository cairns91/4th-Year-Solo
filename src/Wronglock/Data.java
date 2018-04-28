package Wronglock;

import java.util.Random;

/**
 * @author Xuan Created on 2005-1-18
 */

public class Data {

	public int value;

	public Data() {

		Random rnd = new Random();
		value = rnd.nextInt();
	}
}
