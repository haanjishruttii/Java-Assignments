//Question-44

import java.util.Scanner;
class Main{
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in);
	    long n=sc.nextLong();
	    Long Last=n%10;
	    for(;n>=10)
	    {
	        n=n/10;
	    }
	    System.out.println("First digit "+n);
	    System.out.println("Last digit "+Last);
	    Long t=n;
	    n=Last;
	    Last=t;
	    System.out.println("After swapping ");
	    System.out.print("First digit= "+n);
	    System.out.print("Last digit +"+Last);
	}
}
