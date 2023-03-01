package cosc232503lab4sp23test;

import java.util.Arrays;
import java.util.Scanner;

import cosc242503lab4sp23.ArrayExamples;

import java.util.Random;

public class COSC242503_Lab4Test {

	public static void main(String args[]) throws Exception {

		String yourName = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		yourName = in.nextLine();
		System.out.println("Testing for " + yourName + '\r');

		System.out.println("*****Now testing printArray method*****");

		Random rd = new Random(); // creating Random object
		int[] arr = new int[5]; // initializing array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt();
		} // storing 5 random integers in an array

		ArrayExamples.printArray(arr);

		System.out.println('\r' + "*****Now testing resetArray method*****");

		System.out.println("Before Clearing Array:");
		ArrayExamples.printArray(arr);
		ArrayExamples.resetArray(arr);
		System.out.println('\r' + "After Clearing Array:");
		ArrayExamples.printArray(arr);

		System.out.println('\r' + "*****Now testing findAvgForLoop method*****");

		int[] myArray3 = { 70, 45, 25, 78, -58 };
		float retArrayAvg = ArrayExamples.findAvgForLoop(myArray3);
		float expArrayAvg = 32;
		if (retArrayAvg != expArrayAvg) {
			System.out.println("FAILURE expected Array Avg to be: " + expArrayAvg + " instead was " + retArrayAvg);
			System.out.println("Input Array as follows:");
			ArrayExamples.printArray(myArray3);
		} else {
			System.out.println("SUCCESS expected Array Avg was: " + retArrayAvg);
			System.out.println("Input Array as follows:");
			ArrayExamples.printArray(myArray3);
		}

		System.out.println("*****Now testing increaseByValue method*****");

		int[] myArray2 = { 70, 45, 25, 78, -58 };
		System.out.println('\r' + "Starting array values are:" + '\r');
		ArrayExamples.printArray(myArray2);

		int incVal = 38;
		System.out.printf("The increment value is: %d \n", incVal, +'\r');
		int[] expArray2 = { 108, 83, 63, 116, -20 };
		ArrayExamples.increaseByValue(myArray2, incVal);
		if (Arrays.equals(myArray2, expArray2)) {
			System.out.println(
					'\r' + "SUCCESS expected myArray2 was increased by: " + incVal + " and matched expArray2!" + '\r');
			System.out.printf("After Increasing the myArray2 by: %d \n", incVal, "\n");
			ArrayExamples.printArray(myArray2);

		} else {
			System.out.println('\r' + "FAILURE expected Array Avg to be: " + '\r');
			ArrayExamples.printArray(expArray2);
			System.out.println('\r' + "instead was: " + '\r');
			ArrayExamples.printArray(myArray2);

		}

		System.out.println('\r' + "*****Now testing swapArrayValues method*****");

		int[] myArray5 = { 70, 45, 25, 78, -58 };
		System.out.println('\r' + "Starting array values are:" + '\r');
		ArrayExamples.printArray(myArray5);
		int loc1 = 1;
		int loc2 = 4;
		System.out.printf('\r' + "Locations being swapped are: %d , %d\n", loc1, loc2);
		ArrayExamples.swapArrayValues(myArray5, loc1, loc2);
		int[] retArraySwap = myArray5;
		int[] expArraySwap = { 70, -58, 25, 78, 45 };
		if (Arrays.equals(retArraySwap, expArraySwap)) {
			System.out.println('\r' + "SUCCESS expected Array Swap was: ");
			ArrayExamples.printArray(expArraySwap);
		} else {
			System.out.println('\r' + "FAILURE expected Array Swap to be: ");
			ArrayExamples.printArray(expArraySwap);
			System.out.println(" instead was : ");
			ArrayExamples.printArray(retArraySwap);
			
			in.close();
		}

	}
}