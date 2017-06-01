package Search;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class MissingNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

		int x = sc.nextInt();
		int[] arr = new int[x];
		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		int y = sc.nextInt();
		int[] brr = new int[y];
		for (int i = 0; i < y; i++) {
			brr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		Arrays.sort(brr);
		
		if (y > x) {
			for (int i = 0, j = 0; i < y && j < x; i++) {
				while (i < y && j < x && arr[j] == brr[i]) {
					i++;
					j++;
				}
				if (i < y)
					lhs.add(brr[i]);
				else
					while (j < x)
						lhs.add(arr[j++]);
			}
		}

		for (Iterator<Integer> iterator = lhs.iterator(); iterator.hasNext();) {
			System.out.print((Integer) iterator.next() + " ");

		}

		sc.close();
	}

}
