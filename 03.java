/*
3. To convert a decimal to binary number
*/

public class D2B {
	static String getBin(int n) {
	    int rem;
	    String bin = "";
	    while(n > 0) {
	        rem = n % 2; //0
	        n = n / 2; //5
	        bin += rem; //Integer.valueOf(rem);
	    }
	    StringBuilder sb = new StringBuilder(bin);
	    sb.reverse();
	    return sb.toString();
	}
	public static void main(String[] args) {
		int a = 10;
		System.out.println("\t" + getBin(a));
	}
}