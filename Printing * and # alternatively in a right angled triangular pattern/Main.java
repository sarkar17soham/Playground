import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k=1;
      for (int r=1;r<=n;r++)
      {
        for (int c=1;c<=r;c++)
        {
          if(k%2==0)
          {
            System.out.print("#");
          }
            else
            {
              System.out.print("*");
            }
          k++;
        }
        System.out.print("\n");
      }
  		// Type your code here
    }
}