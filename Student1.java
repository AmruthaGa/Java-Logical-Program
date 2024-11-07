import java.util.Scanner;
class Student1
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     int stuno;
     String stuname;
     int math;
     int phy;
     int com;
     System.out.println("Enter Student No:");
     stuno=sc.nextInt();
     System.out.println("Enter Student Name:");
     stuname=sc.next();
     System.out.println("Enter Math marks:");
     math=sc.nextInt();
     System.out.println("Enter physics marks:");
     phy=sc.nextInt();
     System.out.println("Enter computer marks:");
     com=sc.nextInt();
     int tot=math+phy+com;
     float avg=tot/3;
     System.out.println("The Student No is:"+stuno); 
     System.out.println("The Student Name is:"+stuname);
     System.out.println("The Student  Math Marks is:"+math);
     System.out.println("The Student  Physics Marks is:"+phy);
     System.out.println("The Student  Computer Marks is:"+com);
     System.out.println("The Student  Total Marks is:"+tot);
     System.out.println("The Student  Average Marks is:"+avg);
   }
} 
 

