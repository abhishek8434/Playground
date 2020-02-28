import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int r=sc.nextInt();
      int d=sc.nextInt();
      float l;
      if(m>0 && m<=12)
      {
        switch(m)
        {
          case 1: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 2: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 3: 
            l=r*d;
            System.out.printf("%.2f",l);
          break;  
          case 4: 
            l=r*d*1.2f;
            System.out.printf("%.2f",l);
            break;
            case 5: 
            l=r*d*1.2f;
            System.out.printf("%.2f",l);
            break;   case 6: 
            l=r*d*1.2f;
            System.out.printf("%.2f",l);
            break;
            case 7: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 8: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 9: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 10: 
            l=r*d;
            System.out.printf("%.2f",l);
            break;
            case 11: 
            l=r*d*1.2f;
            System.out.printf("%.2f",l);
            break;
          case 12:
            l=r*d*1.2f;
            System.out.printf("%.2f",l);
            break;
         
        }
      }
      else
        System.out.println("Invalid Input");
	}
}