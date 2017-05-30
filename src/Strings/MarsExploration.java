package Strings;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class MarsExploration {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int i =0,count = 0;
        while(i < s.trim().length()){
            if(s.charAt(i++) == 'S');
            else count++;

            if(s.charAt(i++) == 'O');
            else count++;

            if(s.charAt(i++) == 'S');
            else count++;
        }
        
        System.out.println(count);
        
        in.close();
    }

}
