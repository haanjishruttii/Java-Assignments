
// Question :21


import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a : ");
        a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is greater then b");
        }
        else
        {
            System.out.println("b is greather then a");
        }
    }
}
