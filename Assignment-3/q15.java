// Question : 15

import java.util.Scanner;
class Main{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int  cp,t1,t2,t3;
	    System.out.println("Enter cost price of bike : ");
	    cp=sc.nextInt();
	    t1=cp*15/100;
	    t2=cp*10/100;
	    t3=cp*5/100;
	    if(cp>100000)
	    {
	    System.out.println("Road tax to be paid is : "+t1);
	    } 
	    if((cp>50000)&&(cp<=100000))
	    {
	    System.out.println("Road tax to be paid is : "+t2);
	    }
	    if(cp<=50000)
	    {
	    System.out.println("Road tax to be paid is : "+t3);
	    }
	}
}
