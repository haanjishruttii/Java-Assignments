// Question : 19

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of first variable : ");
        a=sc.nextInt();
        System.out.println("Enter the value of second variable : ");
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Value of a after swapping : "+a);
        System.out.println("Value of b after swapping : "+b);
        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= : "+a);
        System.out.println("b= : "+b);
    }
}
