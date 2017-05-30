package algorithmProblems.Implementation;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */

public class BonAppetit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), sum =0;
		int y = sc.nextInt(), pay;
		int [] arr = new int [x]; 
		
		for(int i=0; i<x; i++){
			pay = sc.nextInt();
			arr[i] = pay;
			sum += pay;
		}
		
		pay = sc.nextInt();
		
		if(((sum - arr[y])/2) == pay){
			System.out.println("Bon Appetit");
		}
		else{
			System.out.println( pay - ((sum - arr[y])/2));
		}
		
		sc.close();
		
	}

}
