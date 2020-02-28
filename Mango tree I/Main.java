import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int row=sc.nextInt();
int cols=sc.nextInt();
int n=sc.nextInt();
int i,j,k=0;
String str="A";

  for(i=1;i<=row;i++)
  {         
    for(j=1;j<=cols;j++)
        {
            k++;
            if(k+cols==n||k%cols==0||k==n)
            {
              str="No";
              break;
            }
      else
      {
              str="Yes";
                break;
        
      }
    }
  }
            
              System.out.println(str);
  
  
  
}
}

