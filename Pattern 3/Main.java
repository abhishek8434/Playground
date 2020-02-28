import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	int rows=sc.nextInt();
         
           for (int i =0; i <rows; i++) 
        {
            for (int j =2*i+1; j<=2*rows; j=j+2)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
	}
}