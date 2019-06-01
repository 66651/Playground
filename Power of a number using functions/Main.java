import java.util.Scanner;
class Main{
  public static void main(String[] args)
  {
    Scanner in =new Scanner(System.in);
    int b=in.nextInt();
    int ex=in.nextInt();
    System.out.println(pow(ex,b));
  }
  public static int pow(int ex,int b)
  {
    int power=1;
    while(ex>=1)
    {
      power=power*b;
      ex--;
    }
    return (power);
  }
}