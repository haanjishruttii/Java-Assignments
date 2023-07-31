//Question:5

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the age of first person : ");
        a=sc.nextInt();
        System.out.println("Enter the age of second person : ");
        b=sc.nextInt();
        System.out.println("Enter the age of third person : ");
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.println("First person is the oldest");
        }
        if(b>c && b>a)
        {
            System.out.println("Second person is the oldest");
        }
        if(c>a && c>b)
        {
            System.out.println("Third person is the oldest");
        }
        if(a<b && a<c)
        {
            System.out.println("First person is the youngest");
        }
        if(b<c && b<a)
        {
            System.out.println("Second person is the youngest");
        }
        if(c<a && c<b)
        {
            System.out.println("Third person is the youngest");
        }
     }
}
