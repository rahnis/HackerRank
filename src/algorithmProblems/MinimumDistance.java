package algorithmProblems;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class MinimumDistance {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), x, dist = Integer.MAX_VALUE, z = -1;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i < n; i++){
        	x = in.nextInt();
            if(hm.containsKey(x)){
            	z = i - hm.get(x).intValue();
            	dist = Math.min(dist, z);
            }
            else{
            	hm.put(x, i);
            }
        }
        
        if(z == -1)
        	System.out.println(z);
        else
        	System.out.println(dist);
        
        in.close();
    }

}
