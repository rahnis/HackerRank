package algorithmProblems.Implementation;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class AlmostSorted {

	private static boolean isSorted(int [] arr){
		
		for(int i=1; i<arr.length; i++){
			if(arr[i-1] > arr[i])
				return false;
		}
		return true;
	}
	
	private static void swap(int [] arr, int i, int j){
		int temp;
	    temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
	
	private static void reverse(int [] arr, int i, int j){
		while(i<j){
			swap(arr, i, j);
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int s = 0, e = a-1;
		
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		if(a<2)
	    {
	        System.out.println("yes");
	        return;
	    }

	    if(isSorted(arr))
	    {
	        System.out.println("yes");
	        return;
	    }
	    
	    for(;s < a && arr[s] < arr[s+1]; s++);
	    for(;e < a && arr[e] > arr[e-1]; e--);
	    
	    swap(arr,s,e);
	    if(isSorted(arr))
	    {
	        System.out.println("yes");
	        System.out.println("swap"+" "+(s+1)+" "+(e+1));
	        return;
	    }
	    
	    reverse(arr, s+1, e-1);
	    if(isSorted(arr))
	    {
	        System.out.println("yes");
	        System.out.println("reverse"+" "+(s+1)+" "+(e+1));
	        return;
	    }
	    
	    else{
	    	System.out.println("no");
	    }
	}

}
