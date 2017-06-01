package Sorting;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class RunningTimeOfAlgorithms {

	public static int insertIntoSorted(int[] ar) {
		int count =0;
		for (int i = 1; i < ar.length; i++) {
			int j = i;
			int value = ar[i];
			while (j > 0 && value < ar[j - 1]) {
				ar[j] = ar[j - 1];
				j--;
				
				count++;
			}
			ar[j] = value;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		in.close();
		System.out.println(insertIntoSorted(ar));
	}

}
