package algorithmProblems;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class ViralAdvertising {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int day = sc.nextInt(), sum =0;
        int people = 5;
        
        
        for(int i = 0; i<day; i++){
            people /= 2;  // half people likes it
            sum += people;
            people *= 3;  // everyone shares it three of their friends
        }
        
        System.out.println(sum);
        sc.close();
    }

}
