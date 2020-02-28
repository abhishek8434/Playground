import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	String str=sc.next();
       	String rev="";
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println("Palindrome");
      else
         System.out.println("Not a Palindrome");
	}
}