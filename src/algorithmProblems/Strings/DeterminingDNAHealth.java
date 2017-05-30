package algorithmProblems.Strings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class DeterminingDNAHealth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] genes = new String[n];
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int genes_i = 0; genes_i < n; genes_i++) {
			genes[genes_i] = in.next();
		}
		int[] health = new int[n];
		for (int health_i = 0; health_i < n; health_i++) {
			health[health_i] = in.nextInt();
		}

		int s = in.nextInt();
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int a0 = 0; a0 < s; a0++) {
			int first = in.nextInt();
			int last = in.nextInt();
			String d = in.next();
			int sum = 0;
			for (int i = first; i <= last; i++) {
				if (hm.containsKey(genes[i]))
					hm.put(genes[i], hm.get(genes[i]) + health[i]);
				else
					hm.put(genes[i], health[i]);
			}

			for (int i = 0; i < d.length(); i++) {
				int j = i + 1;

				while (j < d.length() && !hm.containsKey(d.substring(i, j))) {
					j++;
				}

				if (hm.containsKey(d.substring(i, j)))
					sum += hm.get(d.substring(i, j));
			}
			hm.clear();
			max = max < sum ? sum : max;
			min = min > sum ? sum : min;
		}

		System.out.println(min + " " + max);
		in.close();
	}

}
