
// Question : 30

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a year : ");
         int year=sc.nextInt();
         int l1=(year%4);
         int l2=(year%400);
         int centuryyear=(year%100);
         if(centuryyear==0)
         {
         if(l2==0)
         {
             System.out.println("IT is a leap year");
         }
         else
         {
             System.out.println("It is not a leap year");
         }
         }
         else
         {
             if(l1==0)
             {
                 System.out.println("IT is a leap year");
             }
             else
             {
                 System.out.println("It is not a leap year");
             }
         }
      }
}
