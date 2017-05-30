package algorithmProblems.Implementation;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class FindDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), D;
		
		for(int i=0; i<n; i++){
			int x = sc.nextInt(),count=0;
			D = x;
			while(D > 0){
				if( (D%10 != 0) && (x%(D%10) == 0) ) count++;
				D /= 10;
			}
			System.out.println(count);
		}

		sc.close();
	}

}
