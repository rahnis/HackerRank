package algorithmProblems.Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int k = 0; k < x; k++) {
			String s1 = sc.next();
			int i = 0;
			int j = s1.length() - 1;
			int ans = 0;
			while (i <= j) {
				ans += Math.abs((int) s1.charAt(i) - (int) s1.charAt(j));
				i++;
				j--;
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
