//Question:6

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number : ");
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println((-1)*a);
        }
        else
        {
            System.out.println(a);
        }
     }
}
