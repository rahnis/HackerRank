package Sorting;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class QuicksortInPlace {
	private static int[] arr;

	private static void quickSort(int start, int end) {
		if (start >= end)
			return;
		int pivot = arr[end];
		int j = start - 1;

		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		j++;
		int temp = arr[end];
		arr[end] = arr[j];
		arr[j] = temp;
		printArray();
		quickSort(start, j - 1);
		quickSort(j + 1, end);
	}

	private static void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		quickSort(0, x - 1);
		// printArray();
		sc.close();
	}
}
