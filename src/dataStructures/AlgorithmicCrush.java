package dataStructures;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class AlgorithmicCrush {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int q = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>(x);
		
		for (int k = 0; k < q; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int upData = sc.nextInt();
			
			for (int l = i-1; l <= j-1; l++) {
				arr.  upData;
			}
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			
		}
		
		System.out.println(max);
	}

}
