import java.util.Scanner;
class PositiveOrNegative
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter n value:");
     n=sc.nextInt();
     if(n>0)
     {
        System.out.println("The n value is Positive");
     }
     else
     {
        System.out.println("The n value is Negative");
     }
   }
}