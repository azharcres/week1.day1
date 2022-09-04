package week1.day1;

public class Prime {

	public static void main(String[] args) {
		
		int num = 13;
	    boolean flag = true;
	    for (int i = 2; i <= num - 1; i++) {
	     	      if (num % i == 0) {
	        flag = false;
	        break;
	      }
	    }

	    if (flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");

	}
}
