package hackerrankContest;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class WhoGetsTheCatch {

	static int whoGetsTheCatch(int n, int x, int[] X, int[] V) {
		int min = Integer.MAX_VALUE, index=0, count=0;
		for (int i = 0; i < n; i++) {
			if(min > Math.abs((X[i]-x)/V[i]) ){
				index = i;
				count = 0;
				min = Math.abs((X[i]-x)/V[i]);
			}
			else if(min == Math.abs((X[i]-x)/V[i]) ) {
				count++;
			}
		}

		if(count >= 1)
			return -1;
		return index;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x = in.nextInt();

		int[] X = new int[n];

		for (int X_i = 0; X_i < n; X_i++) {
			X[X_i] = in.nextInt();
		}
		int[] V = new int[n];
		for (int V_i = 0; V_i < n; V_i++) {
			V[V_i] = in.nextInt();
		}
		int result = whoGetsTheCatch(n, x, X, V);
		System.out.println(result);
	}
}
