/*
1. To find the sum of any number of integers entered as command line arguments. 
*/

public class Sum {
	public static void main(String[] args) {
		int s = 0;
		for(int i = 0; i < args.length; i++) {
		    int m = Integer.parseInt(args[i]);
		    s += m;
		}
		System.out.println("The Sum is = " + s);
	}
}