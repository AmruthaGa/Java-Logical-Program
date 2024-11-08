import java.util.Scanner;
public class Nested
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,j,n;
      System.out.println("Enter n value:");
      n=sc.nextInt();
      for(i=0;i<n;i++)
      {
         for(j=0;j<n;j++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
    }
}   
       
         
    
