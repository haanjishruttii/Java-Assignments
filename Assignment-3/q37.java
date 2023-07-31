
// Question : 37

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,r,t;
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        r=n%5;
        t=n%11;
        if(r==0)
        {
            System.out.println("It is divisible by  5");
        }
        if(t==0)
        {
            System.out.println("It is divisible by 11");
        }
        if((r==0)&&(t==0))
        {
            System.out.println("It is divisible by both 5 & 11");
        }
        if((r!=0)&&(t!=0))
        {
            System.out.println("Not  divisible by 5 & 11");
        }
     }
}
