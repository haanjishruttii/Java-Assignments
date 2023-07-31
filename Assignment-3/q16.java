// Question : 16

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float r,area;
        System.out.println("Enter radius of the circle=");
        r=sc.nextFloat();
        area=22/7f*r*r;
        System.out.println("Area of circle="+area);
        }
}
