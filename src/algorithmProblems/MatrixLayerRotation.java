package algorithmProblems;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class MatrixLayerRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		int[][] arr = new int[a][b];
		
		for(int i=0; i<a; i++)
			for (int j = 0; j < b; j++)
				arr[i][j] = sc.nextInt();
			
		for(int r=0; r<k; r++){
			for(int i=0; i<a; i++){
				for (int j = 0; j < b; j++){
					arr[i][j] = sc.nextInt();
				}
			}
		}
	}
}
