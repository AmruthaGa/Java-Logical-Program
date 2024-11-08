import java.util.Scanner;
class Product1
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      int pno;
      String pname;
      float pcost;
      float pqua;
      System.out.println("Enter Product No:");
      pno=sc.nextInt();
      System.out.println("Enter Product Name:");
      pname=sc.next();
      System.out.println("Enter Product cost:");
      pcost=sc.nextFloat();
      System.out.println("Enter Product Quantity:");
      pqua=sc.nextFloat();
      float bill=pcost*pqua;
      System.out.println("The Total Bill is:"+bill);
      System.out.println("The Product No is:"+pno);
      System.out.println("The Product Name is:"+pname);
      System.out.println("The Product Cost is:"+pcost);
      System.out.println("The Product Quantity is:"+pqua);
    }
} 
     