package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class GameOfThrones1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		sc.close();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i) + "")) {
				hm.put(s.charAt(i) + "", hm.get(s.charAt(i) + "") + 1);
			} else
				hm.put(s.charAt(i) + "", 1);
		}
		int count = 0;
		for (Map.Entry<String, Integer> data : hm.entrySet()) {
			if (data.getValue() % 2 != 0) {
				count++;
				if (count > 1) {
					System.out.println("NO");
					return;
				}
			}
		}

		System.out.println("YES");

	}

}
