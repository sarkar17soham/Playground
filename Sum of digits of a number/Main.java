import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum =0;
     // int last_digit = n%10;
      while(n>0)
      {
       int rem = n%10;
        sum = rem+sum;
        n = n/10;
      }
      System.out.print(sum);
	    // Type your code here
	}
}