import java.util.Scanner;
class Main
{
   public static int product_of_digits(int m)
   {
     int prod = m*m;
      
      return prod;
   }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     
     
        int prod = product_of_digits(n);
       n = prod;
      
     System.out.println(n); //result printed here
   }
}