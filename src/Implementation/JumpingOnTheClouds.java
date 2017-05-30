package Implementation;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class JumpingOnTheClouds {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count =0;
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        for(int i =0; i<n; ){
        	if(i+2 < n && c[i+2] == 0){
        		i += 2;
        		count++;
        	}
        	else{
        		if(i+1 < n){
            		i++;
            		count++;        			
        		}
        		else
        			break;
        	}
        }
        
        System.out.println(count);
        
        in.close();
    }

}
