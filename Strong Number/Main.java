import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int ne=n;
      int sum=0;
      while(n>0)
      {
        int r=n%10;
        int f=1;
        for(int i=1;i<=r;i++)
        {
          f=f*i;
        }
        sum=sum+f;
        n=n/10;
      }
      if(ne==sum)
      {
        System.out.println("Yes");
      }
      else{
        System.out.println("No");
      }
    }
}
	
