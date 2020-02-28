import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      float t=sc.nextFloat();
      if(n==1)
        System.out.printf("%.2f",t);
      else if(n==2)
        System.out.printf("%.2f",t*1.5f);
      else if(n==3)
        System.out.printf("%.2f",t*2.0f);
      else
        System.out.println("Number of items is more");
	}
}