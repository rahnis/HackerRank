package Introduction;

import java.util.Scanner;

/*
One way to take input from stdin is to use the Scanner class and read in from System.in.
You can write your output to stdout by simply using the System.out.println(String) function.
In this problem, you need to read 3 integers from stdin and print them in stdout.
Sample input:
42
100
125
Sample output:
42
100
125
To make the problem easier for you, part of the code is already provided in the editor.
*/

public class InOut1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
	}

}
