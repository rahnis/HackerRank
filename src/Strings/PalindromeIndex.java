package Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int k = 0; k < x; k++) {
			String s = sc.next();
			int i = 0, j = s.length() - 1;

			if (isPalindrome(s)) {
				System.out.println(-1);
				continue;
			}

			while (i < j) {
				if (s.charAt(i) == s.charAt(j)) {
					i++;
					j--;
				} else {
					if (isPalindrome(s.substring(0, i) + s.substring(i + 1))) {
						System.out.println(i);
						break;
					} else {
						System.out.println(j);
						break;
					}
				}
			}
		}

		sc.close();

	}

	private static boolean isPalindrome(String st) {
		if (st.equals(new StringBuilder(st).reverse().toString()))
			return true;

		return false;
	}

}
