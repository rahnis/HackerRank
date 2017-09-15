/**
* Amanda has a string, s, of m lowercase letters that she wants to copy into a new string, p . 
* She can perform the following operations any number of times to construct string p:
*
* Append a character to the end of string  at a cost p of 1 dollar.
* Choose any substring of p and append it to the end of p at no charge.
*/



import java.io.*;
import java.util.*;

public class StringConstruction {

    static int stringConstruction(String s) {
        int count =0;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        for (int i=0; i<s.length();) {
            if(hm.containsKey(s.charAt(i) +"")) {
                i++;
            } else {
                hm.put(s.charAt(i)+"", 1);
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }
}
