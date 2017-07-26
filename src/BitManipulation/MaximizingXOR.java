import java.io.*;
import java.util.*;

public class MaximizingXOR {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = a; i < b; i++){
            for(int j = a+1; j <= b; j++){
                max = max > (i^j) ? max : (i^j);
            }
        }
        
        System.out.print(max);
    }
}
