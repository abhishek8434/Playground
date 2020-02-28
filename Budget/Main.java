import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	float a=sc.nextFloat();
     	float b=sc.nextFloat();
      	float c=sc.nextFloat();
      	float d=sc.nextFloat();
      	float e=sc.nextFloat();
      	float f=(float)((a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90));
      if(f<15000)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
	}
}