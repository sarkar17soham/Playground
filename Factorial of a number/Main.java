import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ans=1;
     // int num =1;
     // int factors_count=0;
      for (int num=1; num<=n; num++)
      ans = ans * num;
      System.out.println(ans);
        
      }
	    // Type your code here
	
}