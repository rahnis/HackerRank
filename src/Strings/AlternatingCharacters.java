package Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int k = 0; k < x; k++) {
			String s = sc.next();
			char ch = s.charAt(0);
			int count = 0;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == ch) {
					count++;
				} else
					ch = s.charAt(i);
			}
			System.out.println(count);
		}

		sc.close();

	}

}
