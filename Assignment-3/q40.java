
// Question : 40

import java.util.Scanner;
class Main  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sp,cp;
        System.out.println("Enter cost price : ");
        cp=sc.nextInt();
        System.out.println("Enter selling price : ");
        sp=sc.nextInt();
        if(cp<sp)
        {
            System.out.println("Profit");
        }
        else
        {
            System.out.println("Loss");
        }
    }    
}
