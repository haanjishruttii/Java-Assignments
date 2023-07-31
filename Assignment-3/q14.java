// Question : 14

import java.util.Scanner;
class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
             int marks;
	    System.out.println("Enter studen's marks : ");
	    marks=sc.nextInt();
	    if(marks>90)
	    {
	        System.out.println("A");
	    }
	    if((marks>80)&&(marks<=90))
	    {
	        System.out.println("B");
	    }
	    if((marks>=60)&&(marks<=80))
	    {
	        System.out.println("C");
	    }
	    if(marks<60)
	    {
	        System.out.println("D");
	    }
	}
}
