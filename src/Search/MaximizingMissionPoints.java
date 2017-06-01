package Search;

import java.util.Scanner;
import java.util.Scanner;
/**
 * @author Rahul Nishant
 *
 */

// still need to solve

public class MaximizingMissionPoints {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();

		int[][] arr = new int[n][4];

		for (int a0 = 0; a0 < n; a0++) {
			arr[a0][0] = in.nextInt();
			arr[a0][1] = in.nextInt();
			arr[a0][2] = in.nextInt();
			arr[a0][3] = in.nextInt();
		}
		int maxPoint = 0, i = 0, j = 1;
		for (; i < n && j < n;) {
			if (Math.abs(arr[i][0] - arr[j][0]) <= x
					&& Math.abs(arr[i][1] - arr[j][1]) <= y) {
				maxPoint += arr[j][3];
				i++;
				j++;
			} else {
				j++;
			}
		}
		if (j == n && i == n - 1) {
			maxPoint += arr[i][3];
		}

		System.out.println(maxPoint);

		in.close();
	}
}
