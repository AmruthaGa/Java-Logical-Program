import java.util.Scanner;
class Break
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int i,n;
       System.out.println("Enter n value:");
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
          if(i==6)
          {                                                                                                                
            break;
           }
          System.out.println(i);   
       }
         
    }
}