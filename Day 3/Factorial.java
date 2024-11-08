import java.util.*;
class Factorial
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int i=1,n,sum=1;
      System.out.println("Enter n value:");
      n=sc.nextInt();
      while(i<=n)
      {
         sum=sum*i;
         i++;
      }
        System.out.println("The Factorial of Given Number is:"+sum);
    }
}