import java.util.Scanner;
class DoWhile
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int i=1,n;
       System.out.println("Enter n value:");
       n=sc.nextInt();
       do
       {
          if(i%2==0)
          {                                                                                                                
            System.out.println(i);
           }
            i++;
       }while(i<=n);
         
    }
}