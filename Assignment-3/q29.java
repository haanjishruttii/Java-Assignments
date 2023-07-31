
// Question : 29

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,n4,lowestnum;
        System.out.println("Enter first number");
        n1=sc.nextInt();
        System.out.println("Enter second number");
        n2=sc.nextInt();
        System.out.println("Enter third number");
        n3=sc.nextInt();
        System.out.println("Enter fourth number");
        n4=sc.nextInt();
        if(n1 <= n2 && n1 <= n3 && n1 <= n4) {
            lowestnum = n1;
        } else if (n2 <= n1 && n2 <= n3 && n2 <= n4) {
            lowestnum = n2;
        } else if (n3 <= n1 && n3 <= n2 && n3 <= n4) {
            lowestnum = n3;
        } else {
            lowestnum = n4;
        }

        System.out.println("The lowest number is: " + lowestnum);
    }
}
