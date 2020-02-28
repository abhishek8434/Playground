import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int s=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
    for(int i=0;i<n;i++)
    {
      if(a[i]%2==0)
      {
        sum=sum+a[i];
      }
      else
      {
        s=s+a[i];
      }
    }
    System.out.println("The sum of the even numbers in the array is "+sum);
    System.out.println("The sum of the odd numbers in the array is "+s);
  }
}