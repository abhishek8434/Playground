import java.util.Scanner;
class Main
{
	public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String a=sc.next();
      String b=sc.next();
		if(a.equals(b)){
     	 System.out.println("Strings are same");
        }
        else
          System.out.println("Strings are not same");
	}
}