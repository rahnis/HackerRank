package algorithmProblems;

import java.util.Scanner;

/**
 * @author Rahul Nishant
 *
 */
public class CountingValleys {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        int ud=0,count=0;
        boolean valley = true;
        for(int i=0; i< step; i++){
            if(st.charAt(i) == 'U'){
                ud++;
            }
            else{
                ud--;
            }
            
            if(valley && ud < 0){
                count++;
                valley = false;
            }
            
            if(ud >= 0)
                valley = true;
        }
        sc.close();
        System.out.println(count);
    }

}
