import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int val =1;
      for(int r=1;r<=n;r++)
      {
        for(int s=1;s<=n-r;s++)
        {
          System.out.print(" ");
        }
        for (int c=1;c<=r;c++)
        {
          System.out.print(val+" ");
          val++;
        }
        System.out.println();
      }
	}
}