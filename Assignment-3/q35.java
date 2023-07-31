
//  Question : 35

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch=sc.next().charAt(0);
        if((ch>=65)&&(ch<=90))
        {
            System.out.println("It is an alphabet");
        }
        if((ch>=97)&&(ch<=122))
        {
            System.out.println("It is an alphabet");
        }
        else
        {
            System.out.println("It is not an alphabet");
        }
     }
}
