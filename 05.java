/*
To find the sum of any number of integers interactively, i.e., entering every number from the

keyboard, whereas the total number of integers is given as a command line argumen
*/
import java.io.*;

public class iSum {
	public static void main(String[] args) {
		int n = 0;
		try {
		    n = Integer.parseInt(args[0]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
		    e.printStackTrace();
		    System.out.println("No CLI arguments provided.\nUSAGE: java <filename.java> <space-separated arguments>");
		    System.exit(0);
		}
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter " + n + " numbers to find their sum");
		
		while(n > 0) {
		    int t = 0;
		    try {
		        t = Integer.parseInt(br.readLine());
		    }
		    catch(IOException e) {
		        e.printStackTrace();
		    }
		    sum += t;
		}
		System.out.println("Sum = " + sum);	
	}
}