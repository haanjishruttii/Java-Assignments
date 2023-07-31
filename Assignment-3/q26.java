// Question :26

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter any number : ");
        n=sc.nextInt();
        switch(n%2)
        {
            case 1 : System.out.println("It is odd");
            break;
            default : System.out.println("It is even");
        }
     }
}
