package Sorting;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class InsertionSortPart2 {

	public static void insertionSortPart2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int index = i, value = ar[i];
			while (index > 0 && value < ar[index - 1]) {
				ar[index] = ar[index - 1];
				index--;
			}
			ar[index] = value;
			printArray(ar);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
