import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      	String ch=sc.next();
       int length = ch.length();
		String reverse = "";
    for (int i = length - 1 ; i >= 0 ; i--)
        {
            reverse = reverse + ch.charAt(i);
    }
        System.out.println(reverse);
     
	}
}