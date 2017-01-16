/**
 *   File Name: AddingNumbersApp.java<br>
 *
 *   Yakovenko, Galina<br>
 *   Created: Jan 15, 2017
 *
 */

/**
 * AddingNumbersApp:<br>
 * User enters two numbers.<br>
 * Output the sum.
 */

package com.sqa.gy;

import java.util.*;

public class AddingNumbersApp {

	static String appName = "Adding Numbers";

	public static int addTwoNumbers(int addend1, int addend2) {
		System.out.println("Now adding your integers...");
		int sumLocal = addend1 + addend2;
		return sumLocal;
	}

	public static int[] getNumsFrmUsr(String usrName) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Let's get two integers to add!");
		System.out.print("First addend: ");
		int addend1Local = scanner.nextInt();
		System.out.print("Next addend: ");
		int addend2Local = scanner.nextInt();
		scanner.close();
		int[] addends;
		addends = new int[2];
		addends[0] = addend1Local;
		addends[1] = addend2Local;
		System.out.println("Your input has been recorded.");
		return addends;
	}

	public static void main(String[] args) {

		String userName = HelloWorldApp.greetUser(appName);
		int[] usrAddends = getNumsFrmUsr(userName);
		int sum = addTwoNumbers(usrAddends[0], usrAddends[1]);
		prntAddition(usrAddends[0], usrAddends[1], sum);
		HelloWorldApp.farewellUser(userName, appName);

	}

	public static void prntAddition(int addend1, int addend2, int sum) {
		System.out.println("Here is your addition problem:\n" + // <br>
				"\n" + addend1 + " + " + addend2 + " = " + sum + "\n");
	}

}
