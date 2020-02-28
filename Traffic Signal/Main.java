import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
       float s=sc.nextFloat();
       float d=sc.nextFloat();
       float t=sc.nextFloat();
       float ans=(s/3600)*t;
      if(ans<=d)
        System.out.println("No");
      else
         System.out.println("Yes");
	}
}