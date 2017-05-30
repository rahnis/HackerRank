package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class MakingAnagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] ch1 = sc.nextLine().toCharArray();
		char[] ch2 = sc.nextLine().toCharArray();

		sc.close();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		int i = 0, j = 0, count = 0;
		for (; i < ch1.length && j < ch2.length;) {
			if (ch1[i] < ch2[j]) {
				i++;
				count++;
			} else if (ch1[i] > ch2[j]) {
				j++;
				count++;
			} else if (ch1[i] == ch2[j]) {
				i++;
				j++;
			}
		}

		System.out.println(ch1.length + ch2.length - i - j + count);
	}

}
