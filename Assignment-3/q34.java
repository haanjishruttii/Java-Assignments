
// Question :34

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3;
        System.out.println("Enter first side of triangle : ");
        s1=sc.nextInt();
        System.out.println("Enter second side of triangle : ");
        s2=sc.nextInt();
        System.out.println("Enter third side of triangle : ");
        s3=sc.nextInt();
        if((s1==s2)&&(s2==s3))
        {
            System.out.println("It is an equilateral triangle");
        }
        else if((s1==s2)||(s2==s3)||(s1==s3))
        { 
            System.out.println("It is an isosceles trianle");
        }else if(s1!=s2)
        { 
            System.out.println("It is a scalen triangle");
        }
     }
}
