package algorithmProblems.Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < x; i++) {
			boolean flag = true;
			String st = sc.nextLine();
			String rst = new StringBuilder(st).reverse().toString();
			for (int j = 1; j < st.length(); j++) {
				if (Math.abs((int) st.charAt(j) - (int) st.charAt(j - 1)) != Math
						.abs((int) rst.charAt(j) - (int) rst.charAt(j - 1)))
					flag = false;
			}

			if (flag)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		}

		sc.close();
	}

}
