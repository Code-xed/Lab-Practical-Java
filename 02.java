/*
2. To find the factorial of a given number.
*/

import java.io.*;

public class Factorial {
	static long fact(int n) {
	    if (n == 1) {
	        return 1;
	    }
	    else if (n == 0) {
	        return 0;
	    }
	    else {
	        return n * fact(n - 1);
	    }
	}
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number to find its factorial");
		int n = 0;
		try {
		    n = Integer.parseInt(br.readLine());
		}
		catch(IOException e) {
		    e.printStackTrace();
		}
		long f = fact(n);
		System.out.println("Factorial of " + n + " is = " + f);
	}
}
