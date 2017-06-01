package Sorting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */

public class BigSorting {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for (int i = 0; i < n; i++) {
			unsorted[i] = in.next();
		}

		Arrays.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length())
					return 1;
				else if (o1.length() < o2.length())
					return -1;
				else {
					for (int i = 0; i < o1.length(); i++) {
						if ((int) o1.charAt(i) < (int) o2.charAt(i))
							return -1;
						if ((int) o1.charAt(i) > (int) o2.charAt(i))
							return 1;
					}

					return 0;
				}
			};
		});

		for (String s : unsorted)
			System.out.println(s);

		in.close();

	}

}
