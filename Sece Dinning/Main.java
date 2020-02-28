import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	String str=sc.next();
      	int n=sc.nextInt();
      if(str.equals("front"))
      {
        if(n==1)
          System.out.println("Left Handed");
        else
          System.out.println("Right Handed");
      }
      else
      {
        if(n==1)
          System.out.println("Right Handed");
        else
          System.out.println("Left Handed");
      }
    }
}
  
