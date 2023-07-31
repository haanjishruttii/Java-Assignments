// Question : 22

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,r;
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        r=n%2;
        if(r==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
