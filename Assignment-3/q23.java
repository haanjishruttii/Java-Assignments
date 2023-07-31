
// Question : 23

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of first variable a : ");
        a=sc.nextInt();
        System.out.println("Enter the value of second variable b: ");
        b=sc.nextInt();
        System.out.println("Enter the value of second variable : c");
        c=sc.nextInt();
        if((a>b)&&(a>c))
        {
            System.out.println("a is gggratest");
        }
        if((b>a)&&(b>c))
        {
            System.out.println("b is greatest");
        }
        if((c>a)&&(c>b))
        {
            System.out.println("c is greatest");
        }
     }
}
