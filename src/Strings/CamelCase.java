package Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class CamelCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String[] st = s.split("(?<!^)(?=[A-Z])");

		System.out.println(st.length);
		in.close();
	}
}
