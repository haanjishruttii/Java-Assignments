
// Question : 36

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,a1,a2,a3;
        System.out.println("Enter angle one=");
        a1=sc.nextInt();
        System.out.println("Enter angle two=");
        a2=sc.nextInt();
        System.out.println("Enter angle three=");
        a3=sc.nextInt();
        a=a1+a2+a3;
        if(a==180)
        {
            System.out.println("It is a valid triangle");
        }
        else
        {
            System.out.println("It is not a valid triangle");
        }
    }
}
