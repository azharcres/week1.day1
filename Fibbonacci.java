package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
	
		int n = 10, a = 0, b = 1;
 
		System.out.println("Fibbonacci Series");
	    for (int i = 1; i <= n; i++) {
	      System.out.println(a);	     
	      int sum = a + b;
	      a = b;
	      b = sum;
	      		
		}
		}


}
