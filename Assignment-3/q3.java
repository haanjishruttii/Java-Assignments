//Question:3
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int salary,service;
        System.out.println("Enter employ's salary :  ");
        salary=sc.nextInt();
        System.out.println("Time duration of emply's service in years : ");
        service=sc.nextInt();
        float bonus=salary*5/100f;
        if(service>5)
        {
            System.out.println("Bonus Amount : "+bonus);
            System.out.println("Net Bonus Amount : "+(salary+bonus));
        }
        else
        {
            System.out.println("Salary="+salary);
        }
    }
}
