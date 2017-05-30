package Implementation;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		int x = sc.nextInt();
		int y = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		for(int i = x ; i <= y; i++){
			int rev = Integer.parseInt(new StringBuffer(i+"").reverse().toString());
			if(Math.abs((i - rev)%k) == 0)
				count++;
		}
		
	    System.out.println(count);
	    sc.close();
    }

}
