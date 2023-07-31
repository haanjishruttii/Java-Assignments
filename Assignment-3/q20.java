
// Question : 20

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of first variable : ");
        a=sc.nextInt();
        System.out.println("Enter the value of second variable : ");
        b=sc.nextInt();
        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println("Values of a & b after swapping :"+a+" and "+b);
    }
}
