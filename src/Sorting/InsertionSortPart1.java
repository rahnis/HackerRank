package Sorting;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int j = i;
			int value = ar[i];
			while (j > 0 && value < ar[j - 1]) {
				ar[j] = ar[j - 1];
				j--;
				printArray(ar);
			}
			ar[j] = value;
		}
		printArray(ar);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
