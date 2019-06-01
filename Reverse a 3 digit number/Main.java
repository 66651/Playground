import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    int a,b,c,r;
    a=n1/100;
    b=((n1/10)%10);
    c=(n1%10);
    r=((c*100)+(b*10)+(a));
    System.out.println(r);
  }
}