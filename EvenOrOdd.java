import java.util.Scanner;
class EvenOrOdd
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter n value:");
     n=sc.nextInt();
     if(n%2==0)
     {
        System.out.println("The n value is Even");
     }
     else
     {
        System.out.println("The n value is Odd");
     }
   }
}