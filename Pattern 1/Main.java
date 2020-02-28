import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
    int rows = sc.nextInt();
        for (int i = 2*rows-1; i >= 1; i=i-2) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
      }
	
}