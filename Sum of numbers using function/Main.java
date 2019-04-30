import java.util.Scanner;
class Main
{
   public static int sum_of_digits(int n)
   {
      int sum=0;
     int count=1;
        
      while(count <=n)
      {
         sum = sum+ count;
        count = count+1;
      }
      return sum;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     
        int sod = sum_of_digits(n);
        n = sod;
     
     System.out.println(n); //result printed here
   }
}