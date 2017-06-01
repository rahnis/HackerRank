package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class Quicksort1Partition {

	// solution 1

	// static void partition(int[] ar) {
	// int temp = 0;
	// int pivot = ar[0];
	// int pIndex = ar.length - 1;
	// for (int i = ar.length - 1; i >= 1; i--) {
	// if (ar[i] >= pivot) {
	// temp = ar[i];
	// ar[i] = ar[pIndex];
	// ar[pIndex] = temp;
	// pIndex -= 1;
	// }
	// }
	// temp = ar[pIndex];
	// ar[pIndex] = ar[0];
	// ar[0] = temp;
	// printArray(ar);
	// }

	// solution 2

	static void partition(int[] ar) {
		int temp = 0;
		int pivot = ar[0];
		int[] copy = Arrays.copyOf(ar, ar.length);
		for (int i = 1; i < ar.length; i++) {
			if (copy[i] <= pivot) {
				ar[temp++] = copy[i];
			}
		}
		ar[temp++] = pivot;
		for (int i = 0; i < ar.length; i++) {
			if (copy[i] > pivot) {
				ar[temp++] = copy[i];
			}
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
		partition(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
