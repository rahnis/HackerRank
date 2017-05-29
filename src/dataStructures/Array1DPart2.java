package dataStructures;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class Array1DPart2 {

	public static boolean canWin(int leap, int[] game) {
		int x = game.length - 1, i = 0;

		for (i = 0; i <= x;) {
			if (i + leap > x)
				return true;
			if (i + leap < x && game[i + leap] == 0)
				i += leap;
			else if ( i > 0 && (i + leap - 1) < x && game[i - 1] == 0
					&& game[i + leap - 1] == 0)
				i--;
			else if (i + 1 < x && game[i + 1] == 0)
				i++;
			else
				break;
		}

		if (i > x)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();
	}

}
