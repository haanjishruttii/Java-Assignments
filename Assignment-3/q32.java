
// Question : 32

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float n;
        System.out.println("Enter a number : ");
        n=sc.nextFloat();
        if(n>0)
        {
            System.out.println("Entered  number has(+)sign");
        }
        else
        {
            System.out.println("Entered number has (-) sign");
        }
     }
}
