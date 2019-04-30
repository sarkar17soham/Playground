import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
     // int num =1;
     // int factors_count=0;
      for (int num=1; num<=n; num++)
      {
      if (n%num==0)
        {
        //factors_count=factors_count+1;
      System.out.println(num + " ");
        }
      }
	    // Type your code here
	}
}