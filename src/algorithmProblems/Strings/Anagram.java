package algorithmProblems.Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			String s = sc.next();

			if (s.length() % 2 != 0) {
				System.out.println(-1);
			} else {
				StringBuilder sb1 = new StringBuilder(s.substring(0,
						s.length() / 2));
				StringBuilder sb2 = new StringBuilder(
						s.substring(s.length() / 2));

				int count = 0, y = sb1.length();
				for (int j = y - 1; j >= 0; j--) { // every string will get shorter so we have to mode from max to 0
					int index = sb2.indexOf(sb1.substring(j, j + 1));
					if (index < 0) {
						sb1.replace(j, j + 1, "");
						count++;
					} else {
						sb1.replace(j, j + 1, "");
						sb2.replace(index, index + 1, "");
					}
				}

				System.out.println(count);
			}
		}

		sc.close();

	}

}
