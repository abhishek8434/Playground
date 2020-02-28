import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
		int arr[]=new int[50];
      	int s=sc.nextInt();
       for(int i=0; i<s; i++)
       {
           arr[i] = sc.nextInt();
       }
       int l = arr[0];
       for(int i=1; i<s; i++)
       {
           if(l < arr[i])
           {
               l = arr[i];
           }
   
       }
        System.out.println(l+" is the maximum element in the array");
    }
}