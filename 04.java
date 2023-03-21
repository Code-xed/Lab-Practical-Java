/*
3. To convert a decimal to binary number
*/

import java.io.*;

public class D2B {
	static String getBin(int n) {
	    int rem;
	    String bin = "";
	    while(n > 0) {
	        rem = n % 2;
	        n = n / 2;
	        bin += rem;
	    }
	    StringBuilder sb = new StringBuilder(bin);
	    sb.reverse();
	    return sb.toString();
	}
	public static void main(String[] args) {
		int a = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter A Decimal value");
		try {
		    a = Integer.parseInt(br.readLine());
		}
		catch(IOException e) {
		    e.printStackTrace();
		}
		System.out.println("\t Binary Equivalent of " + a + " = " + getBin(a));
	}
}
