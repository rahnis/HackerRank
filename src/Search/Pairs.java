package Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class Pairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int diff = sc.nextInt();
		int[] arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < x - 1; i++) {
			int j = i + 1;
			while (j < x && arr[j] - arr[i] < diff)
				j++;
			if (j < x && arr[j] - arr[i] == diff)
				count++;
		}

		System.out.println(count);
		sc.close();
	}

}
