import java.util.Scanner;
class Main{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int b = in.nextInt();
    int e = in.nextInt();
    System.out.print(power(b,e));
  }
  public static int power(int b, int e)
  {
    int pow=1;
    while(e>=1)
    {
      pow=pow*b;
      e--;
    }
    return pow;
  }
}

