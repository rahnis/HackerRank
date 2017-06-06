package Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class RunningTimeOfQuicksort {

	private static int cnt = 0;

	private static int insertionSort(int[] arr) {
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			int j = i, value = arr[i];
			while (j > 0 && value < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
				count++;
			}

			arr[j] = value;
		}

		return count;
	}

	private static void quickSort(int[] qrr, int start, int end) {
		if (end - start <= 0)
			return;

//		if (end - start == 1) {
//			if (qrr[end] < qrr[start]) {
//				int temp = qrr[end];
//				qrr[end] = qrr[start];
//				qrr[start] = temp;
//				cnt++;
//			}
//			return;
//		}

		int pivote = qrr[end];
		int j = start - 1;

		for (int i = start; i < end; i++) {
			if (pivote >= qrr[i]) {
				j++;
				int temp = qrr[j];
				qrr[j] = qrr[i];
				qrr[i] = temp;
				cnt++;
			}
		}
		j++;
		int temp = qrr[end];
		qrr[end] = qrr[j];
		qrr[j] = temp;
		cnt++;

		quickSort(qrr, start, j - 1);
		quickSort(qrr, j + 1, end);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int[] arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		int[] qrr = Arrays.copyOf(arr, arr.length);

		quickSort(qrr, 0, qrr.length - 1);

		//System.out.println("ins " + insertionSort(arr) + "quick " + cnt);
		System.out.println(insertionSort(arr) - cnt);
		sc.close();
	}
}
